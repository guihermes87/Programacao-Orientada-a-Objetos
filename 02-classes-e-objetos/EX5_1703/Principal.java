
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

            Scanner teclado = new Scanner (System.in);
            
    
            System.out.println("Qual construtor você deseja usar? (1 para nome e idade, 2 para idade apenas)");
            int escolha = teclado.nextInt();
            teclado.nextLine(); // Consumir a nova linha após o nextInt()
            
            switch (escolha) {
            
            case 1:
            {    
                System.out.print("Digite o nome: ");
                String nome = teclado.nextLine();
                System.out.print("Digite a idade: ");
                int idade = teclado.nextInt();
                Pessoa pessoa1 = new Pessoa(nome, idade);
                System.out.println("Nome: " + pessoa1.nome + ", Idade: " + pessoa1.idade);    
                
                break;
            }
            
            case 2:
            {
                System.out.print("Digite a idade: ");
                int idade2 = teclado.nextInt();
                
                Pessoa pessoa2 = new Pessoa(idade2);
                System.out.println("Idade: " + pessoa2.idade);
                break;
            }
            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
            }
    }
}