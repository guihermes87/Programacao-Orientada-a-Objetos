package Cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Model.Numero;
import Model.Resultado;



public class PrincipalCLiente {

    public static void main(String[] args) {
        
        try {
            
            Socket s = new Socket("localhost", 1020);
            System.out.println("Conectado ao servidor.");
            
            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(s.getInputStream());

            Numero n = new Numero(13.4f, 4.77f);
            out.writeObject(n);
            
            Resultado res;
            res = (Resultado) in.readObject();

            System.out.println("Resultado recebido do servidor: " + res.getResultado());
            s.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
