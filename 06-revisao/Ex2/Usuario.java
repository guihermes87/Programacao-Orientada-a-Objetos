import java.util.Scanner;

public class Usuario {

    private String nomeUsuario;
    private String senha;
    public boolean logado = false;

    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

   

    public boolean login(String usuario, String senha) {
        if (this.nomeUsuario.equals(usuario) && this.senha.equals(senha)) {
            this.logado = true;
            return true;
        } else {
            this.logado = false;
            return false;
        }
    }

    

    public void logout() {
        
        Scanner teclado = new Scanner (System.in);
        int opcao;
        System.out.println("Digite 1 para deslogar");
        opcao = teclado.nextInt();
        
        if (opcao == 1) {
            this.logado = false;
             System.out.println("Usuário deslogado com sucesso.");    
        }
    }

    public void ExibirStatus() {
        if (this.logado == true) {
            System.out.println("Usuário " + this.nomeUsuario + " está logado.");
        } else {
            System.out.println("Usuário " + this.nomeUsuario + " não está logado.");
        }
    }

}
