package Server;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import Model.Numero;
import Model.Resultado;


public class PrincipalServer {

    public static void main(String[] args) {
        
        try {

            ServerSocket servidor = new ServerSocket(1020);
            System.out.println("Servidor iniciado, esperando conexão...");

            while (true) {
                
                Socket cliente = servidor.accept();
                ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());

                Numero n;
                Resultado res;

               //Leio o objeto do cliente
               n = (Numero) in.readObject();
                
                System.out.println("Recebi do cliente: " + n.getX() + " e " + n.getY());

                float resultado = n.getX() + n.getY();
                
                res = new Resultado(resultado); //Crio o objeto de resposta
                
                out.writeObject(res); //Envio o objeto de resposta para o cliente
                cliente.close();
            }
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro de E/S: " + e.getMessage());
        }
        
    }

}
