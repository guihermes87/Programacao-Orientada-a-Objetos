import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Produto produto = new Produto("Produto Teste");
        int opcao = -1;
 
        do {
            exibirMenu();
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpar o buffer
 
                switch (opcao) {
                    case 1: {
                        System.out.print("Informe o nome do produto: ");
                        String nome = scanner.nextLine();
                        produto = new Produto(nome);
                        System.out.println("Produto criado com sucesso!");
                        break;
                    }
                    case 2: {
                        System.out.print("Informe o nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Informe o preço do produto: ");
                        double preco = scanner.nextDouble();
                        scanner.nextLine();
                        produto = new Produto(nome, preco);
                        System.out.println("Produto criado com sucesso!");
                        break;
                    }
                    case 3: {
                        produto.exibirInformacoes();
                        break;
                    }
                    case 4: {
                        System.out.println("Nome atual do produto: " + produto.getNome());
                        System.out.print("Informe o novo nome do produto: ");
                        produto.setNome(scanner.nextLine());
                        System.out.println("Nome atribuído com sucesso!");
                        System.out.println("Novo nome:"+produto.getNome());
                        break;
                    }
                    case 5: {
                        System.out.println("Nome do produto: " + produto.getNome());
                        break;
                    }
                    case 6: {
                        System.out.print("Informe o novo preço do produto: ");
                        produto.setPreco(scanner.nextDouble());
                        System.out.println("Preço atribuído com sucesso!");
                        break;
                    }
                    case 7: {
                        System.out.printf("Preço do produto: R$ %.2f%n", produto.getPreco());
                        break;
                    }
                    case 8: {
                        System.out.print("Informe a quantidade em estoque: ");
                        int qtd = scanner.nextInt();
                        scanner.nextLine();
                        produto.setQuantidadeEstoque(qtd);
                        System.out.println("Quantidade atribuída com sucesso!");
                        break;
                    }
                    case 9: {
                        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
                        break;
                    }
                    case 0: {
                        System.out.println("Saindo do sistema... Até logo!");
                        break;
                    }
                    default: {
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um valor no formato correto.");
                scanner.nextLine(); // limpa o buffer para evitar loop infinito
                opcao = -1;
            }
 
            System.out.println();
        } while (opcao != 0);
 
        scanner.close();
    }
 
    public static void exibirMenu() {
        System.out.println("================ MENU ================");
        System.out.println("1 - Criar produto informando nome");
        System.out.println("2 - Criar produto informando nome e preço");
        System.out.println("3 - Exibir informações do produto");
        System.out.println("4 - Atribuir nome do produto");
        System.out.println("5 - Obter nome do produto");
        System.out.println("6 - Atribuir preço do produto");
        System.out.println("7 - Obter preço do produto");
        System.out.println("8 - Atribuir quantidade em estoque");
        System.out.println("9 - Obter quantidade em estoque");
        System.out.println("0 - Sair");
        System.out.println("======================================");
        System.out.print("Escolha uma opção: ");
    }
}
 


// alterar nome do produto
