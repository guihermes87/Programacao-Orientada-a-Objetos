
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Pessoa p = new Pessoa("", 0);

       

        while (p.getNome() == null || p.getIdade() == 0) {
            
                System.out.println("Digite o novo nome: ");
                String nome = teclado.nextLine();
                p.setNome(nome);
        }
                
                System.out.println("Digite a nova idade: ");
                int idade = teclado.nextInt();
                p.setIdade(idade);
    
                    teclado.nextLine(); // Limpar o buffer do teclado
            
                    System.out.println("Nome atualizado: " + p.getNome());
                    System.out.println("Idade atual: " + p.getIdade());
        
    }
}


