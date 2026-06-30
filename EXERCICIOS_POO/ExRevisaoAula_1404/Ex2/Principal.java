import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
       
        Usuario usuario1 = new Usuario("hermes", "1234");
        
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = teclado.nextLine();
        System.out.print("Digite a senha: ");
        String senha = teclado.nextLine();

        if (usuario1.login(nomeUsuario, senha)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Login falhou. Verifique seu nome de usuário e senha.");
        }
        
            usuario1.ExibirStatus();
            usuario1.logout();
            usuario1.ExibirStatus();
    
            teclado.close();

    }
    
    
}