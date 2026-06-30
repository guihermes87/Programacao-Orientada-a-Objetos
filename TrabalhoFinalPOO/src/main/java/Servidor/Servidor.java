package Servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import ArquivoVeiculo.Arquivo;
import ArquivoVeiculo.Veiculo;


public class Servidor{

    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo("veiculos");
        List<Veiculo> listaVeiculos = arquivo.lerArquivo();

       try {

            ServerSocket servidor = new ServerSocket(1020);
            System.out.println("Servidor iniciado, esperando conexão...");

            while (true) {

                Socket cliente = servidor.accept();
                ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());

                try {
                
                
                Veiculo veiculo = (Veiculo) in.readObject();

                listaVeiculos.add(veiculo);
                arquivo.gravarArquivo(veiculo);

                    System.out.println("Veículo cadastrado");
                    out.writeObject("Veículo cadastrado na lista com sucesso! Total de veículos: " + listaVeiculos.size());

                } catch (ClassNotFoundException e) {
                    out.writeObject("Objeto recebido não é um Veiculo válido.");
                }

                cliente.close();
            }

        } catch (IOException e) {
            System.out.println("Erro de E/S: " + e.getMessage());
        }
    }
}
