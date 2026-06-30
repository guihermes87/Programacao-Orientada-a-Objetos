
import java.util.ArrayList;
import java.util.Scanner;
import pkg.src.Produto;


public class Principal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();
        
        
        System.out.println("Digite a quantidade de produtos:");
        int totalProduto = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        
        for (int i = 0; i < totalProduto; i++) {
            System.out.println("Digite o nome do produto:");
            String nome = scanner.nextLine();

            System.out.println("Digite o preço do produto:");
            double preco = scanner.nextDouble();

            System.out.println("Digite a quantidade em estoque do produto:");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            Produto produto1 = new Produto(nome, preco, quantidade);
            produtos.add(produto1);

            double valorTotal = preco * quantidade;
                System.out.println("Valor total do estoque de " + nome + ": " + valorTotal);

            double mediaValorTotal = valorTotal/totalProduto;
                System.out.println("Valor total médio dos produtos: " + mediaValorTotal);

            

        }

        
    
        

            
        
    
    }

}
