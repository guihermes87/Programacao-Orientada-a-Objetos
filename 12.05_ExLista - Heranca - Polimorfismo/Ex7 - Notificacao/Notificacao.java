import java.util.Scanner;

public class Notificacao {

    private String mensagem;
    private int contato;
    

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public void enviar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o contato para o qual deseja enviar a notificação:");
        this.contato = scanner.nextInt();
        System.out.println("Digite a mensagem que deseja enviar:");
        this.mensagem = scanner.nextLine();

        System.out.println("Enviando notificação para:" + contato + "Mensagem :" + mensagem);
    }

}
