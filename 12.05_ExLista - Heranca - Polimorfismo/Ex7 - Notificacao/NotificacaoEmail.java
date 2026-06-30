import java.util.Scanner;
public class NotificacaoEmail extends Notificacao {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void enviar() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enviando notificação por email para: " + email);
        System.out.println("Deseja adicionar outro contato para receber a notificacão? (S/N)");
        String opcao = scanner.nextLine();
        
        if (opcao == "Sim" || opcao == "S") { 
            System.out.println("Digite o contato para o qual deseja enviar a notificação:");
            this.contato = scanner.nextInt();
        }
        System.out.println("Mensagem: " + getMensagem());
    }

}
