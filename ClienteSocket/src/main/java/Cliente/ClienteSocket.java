/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


/**
 *
 * @author hermes
 */
public class ClienteSocket {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            //Criar então o socket cliente e conectar ao servidor
            
            Socket s = new Socket("localhost", 4567);
            System.out.println("Conectado ao servidor");

            //declarar os streams de comunicação com o servidor
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            DataInputStream in = new DataInputStream(s.getInputStream());

            float x,y, resultado;
            System.out.println("Digite o primeiro número: ");
            x = teclado.nextFloat();
            System.out.println("Digite o segundo número: ");
            y = teclado.nextFloat();

            //envio os dados para o servidor
            out.writeFloat(x);
            out.writeFloat(y);

            //leitura da resposta do servidor
            resultado = in.readFloat();
            System.out.println("Resultado da soma: " + resultado);

            s.close();



        } catch ( IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        teclado.close();
    }
}
