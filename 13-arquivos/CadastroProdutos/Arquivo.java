import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável pela manipulação do arquivo de texto.
 *
 * Usa as classes do pacote java.io:
 *  - FileWriter / BufferedWriter -> para escrever (gravar) no arquivo
 *  - FileReader / BufferedReader -> para ler do arquivo
 *
 * Cada produto é gravado em uma linha, com os campos separados por ";".
 * Exemplo de linha:  Teclado;120.50;10
 */
public class Arquivo {

    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;

    private final String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    /**
     * Grava um produto no final do arquivo.
     * O segundo parâmetro do FileWriter (true) habilita o modo "append",
     * ou seja, adiciona ao final sem apagar o que já existe.
     */
    public void gravarProduto(Produto p) {
        try {
            arqw = new FileWriter(nomeArquivo, true);
            escritor = new BufferedWriter(arqw);

            escritor.write(p.getNome() + ";" + p.getPreco() + ";" + p.getQuantidade());
            escritor.newLine();

            escritor.close();
            arqw.close();

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    /**
     * Lê todas as linhas do arquivo e devolve uma lista de Produto.
     * Caso o arquivo ainda não exista, devolve uma lista vazia.
     */
    public List<Produto> lerProdutos() {
        List<Produto> produtos = new ArrayList<>();

        try {
            arqr = new FileReader(nomeArquivo);
            leitor = new BufferedReader(arqr);

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(";");

                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                produtos.add(new Produto(nome, preco, quantidade));
            }

            leitor.close();
            arqr.close();

        } catch (IOException e) {
            // Se o arquivo ainda não existe, apenas avisamos e seguimos com a lista vazia.
            System.out.println("Não foi possível ler o arquivo (talvez ainda não exista): " + e.getMessage());
        }

        return produtos;
    }

    /**
     * Calcula o valor total de todos os produtos guardados no arquivo.
     */
    public double calcularValorEstoque() {
        double total = 0;
        for (Produto p : lerProdutos()) {
            total += p.getValorTotal();
        }
        return total;
    }
}
