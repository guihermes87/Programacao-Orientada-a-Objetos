//Crie dois produtos, sendo um com valores informados via teclado e outro com valores definidos no código
//Exiba as informações e o valor total de cada produto (preço * quantidade).

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        // Produto com valores informados via teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto:");
        String nome1 = scanner.nextLine();
        
        System.out.println("Digite o preço do produto:");
        double preco1 = scanner.nextDouble();
        
        System.out.println("Digite a quantidade do produto:");
        int quantidade1 = scanner.nextInt();
        
        Produto produto1 = new Produto(nome1, preco1, quantidade1);
        
        
        Produto produto2 = new Produto("Notebook", 2500.00, 5);
        
        System.out.println("\nInformações do Produto 1:");
        produto1.exibirInformacoes();
        System.out.println("Valor Total: R$ " + produto1.calcularValorTotal());
        
        
        System.out.println("\nInformações do Produto 2:");
        produto2.exibirInformacoes();
        System.out.println("Valor Total: R$ " + produto2.calcularValorTotal());
        
        scanner.close();

        
    
}
}