import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
    Agenda agenda = new Agenda("João", "123456789");
    System.out.println("Contato: " + agenda.getNome() + " - " + agenda.getTelefone());
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Adicionando contato...");
        System.out.println("Nome do contato: ");
        agenda.setNome(scanner.nextLine());
        System.out.println("Telefone do contato: ");
        agenda.setTelefone(scanner.nextLine());
        agenda.adicionarContato();
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
  
    
}

}
