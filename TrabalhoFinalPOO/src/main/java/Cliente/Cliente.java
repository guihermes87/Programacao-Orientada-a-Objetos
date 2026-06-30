package Cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import ArquivoVeiculo.Veiculo;

public class Cliente {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 1020);

        try {

        ObjectOutputStream saida   = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream  entrada = new ObjectInputStream(socket.getInputStream());

        Scanner sc = new Scanner(System.in);
        System.out.print("Placa: ");  
         String placa  = sc.nextLine();
        System.out.print("Modelo: ");  
        String modelo = sc.nextLine();
        System.out.print("Marca: ");   
        String marca  = sc.nextLine();
        System.out.print("Ano: ");     
        int ano = sc.nextInt();
        System.out.print("Km: ");      
        double km = sc.nextDouble();

        Veiculo v = new Veiculo(placa, modelo, marca, ano, km);
        saida.writeObject(v);

        
        String resposta = (String) entrada.readObject();
        System.out.println(resposta);

        socket.close();
        
    } catch (IOException e) {
        System.out.println("Erro: " + e.getMessage());
    }
    }
}
