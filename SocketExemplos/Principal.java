import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Principal {

    public static void main(String[] args) {
        
    
    try {

        //Criação do Socket servidor e definir a porta de funcionamento

        ServerSocket servidor = new ServerSocket(4567);
        System.out.println("Servidor iniciado na porta 4567");
        
        while (true) {
            //Aceitar conexões de clientes.
            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());

            //Streams de comunicação com o cliente.
            DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
            DataInputStream in = new DataInputStream(cliente.getInputStream());

            //leitura da mensagem enviada pelo cliente
            float x,y, resposta;

            //leio o que o cliente envia
            x = in.readFloat();
            y = in.readFloat();
            //consegui obter a solicitação do cliente, agora vou processar a solicitação e enviar a resposta
            System.out.println("Mensagem recebida do cliente: " + x + " + " + y);

            resposta = x + y;

            //envio a resposta para o cliente
            out.writeFloat(resposta);
        }

        

    } catch (IOException e) {
        System.out.println("Erro: " + e.getMessage());
    }

}
}