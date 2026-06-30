import java.util.List;
import java.util.Scanner;

/**
 * Programa de exemplo: Cadastro de Produtos em arquivo de texto.
 *
 * Demonstra a leitura e a escrita de dados em arquivo usando as classes
 * FileWriter, BufferedWriter, FileReader e BufferedReader (pacote java.io).
 *
 * Os dados ficam salvos em "produtos.txt", então continuam existindo
 * mesmo depois que o programa é encerrado.
 */
public class Principal {

    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo("produtos.txt");
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== CADASTRO DE PRODUTOS =====");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Listar produtos do arquivo");
            System.out.println("3 - Mostrar valor total do estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    Produto produto = new Produto(nome, preco, quantidade);
                    arquivo.gravarProduto(produto);
                    System.out.println("Produto gravado no arquivo com sucesso!");
                    break;

                case 2:
                    List<Produto> produtos = arquivo.lerProdutos();
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado ainda.");
                    } else {
                        System.out.println("\n--- Produtos cadastrados ---");
                        for (Produto p : produtos) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    double total = arquivo.calcularValorEstoque();
                    System.out.printf("Valor total do estoque: R$ %.2f%n", total);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
