
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome e a idade da pessoa:");
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        
        System.out.println("Informe o tipo da pessoa:");
        String tipo = scanner.next();

        Pessoa pessoa1 = new Pessoa(tipo, nome, idade);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        
        pessoa1.falar();
        pessoa1.andar();
    }
}
