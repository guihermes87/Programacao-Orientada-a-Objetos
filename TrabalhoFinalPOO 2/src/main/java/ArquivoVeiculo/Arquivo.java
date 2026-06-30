package ArquivoVeiculo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Arquivo {

    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;
    private List<Veiculo> listaVeiculos;
    public String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.listaVeiculos = new ArrayList<>();
    }
    
    
    public void gravarArquivo(Veiculo a) {
        try {
            arqw = new FileWriter(nomeArquivo + ".txt", true);
            escritor = new BufferedWriter(arqw);
            escritor.write(a.getPlaca() + "," + a.getModelo() + "," + a.getMarca()
                    + "," + a.getAnodeFabricacao() + "," + a.getKilometragem());
            escritor.newLine();

            escritor.close();
            arqw.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public void regravarArquivo(List<Veiculo> lista) {
        try {
            arqw = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqw);
            for (Veiculo v : lista) {
                escritor.write(v.getPlaca() + "," + v.getModelo() + "," + v.getMarca()
                        + "," + v.getAnodeFabricacao() + "," + v.getKilometragem());
                escritor.newLine();
            }
            escritor.close();
            arqw.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao regravar o arquivo: " + e.getMessage());
        }
    }

    public List<Veiculo> lerArquivo() {
        try {
            arqr = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqr);
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");
                String placa = campos[0];
                String modelo = campos[1];
                String marca = campos[2];
                int anodeFabricacao = Integer.parseInt(campos[3]);
                double kilometragem = Double.parseDouble(campos[4]);

                listaVeiculos.add(new Veiculo(placa, modelo, marca, anodeFabricacao, kilometragem));
            }
            leitor.close();
            arqr.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
        return listaVeiculos;
    }
}