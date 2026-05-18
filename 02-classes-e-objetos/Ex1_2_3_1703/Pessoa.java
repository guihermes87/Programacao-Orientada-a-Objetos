
import java.util.Scanner;

public class Pessoa {
    public String nome;
    public String email;
    public String dataDeNascimento;
    public String endereco;
    public boolean admin;

    void emailpessoa() {
        System.out.println("Email: " + email);
    }

    void promoverParaAdmin(Pessoa pessoa) {
        if (!pessoa.admin) {
            pessoa.admin = true;
            System.out.println("A pessoa " + pessoa.nome + " foi promovida a admin.");
        } else {
            System.out.println("A pessoa " + pessoa.nome + " já é admin.");
        }
    }


    public Pessoa(String nome, String email, String dataDeNascimento, String endereco, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        admin = true;
    }



    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("joão", "Joaopqs@hotmail.com", "01/01/2000", "Rua das Flores, 123", true);


        pessoa1.emailpessoa();

        Scanner teclado = new Scanner(System.in);


        System.out.println("Deseja promover a pessoa para admin? (1 para sim, 0 para não)");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            pessoa1.promoverParaAdmin(pessoa1);
        } else {
            System.out.println( pessoa1.nome + " não foi promovida a admin.");
        }



    }
}
