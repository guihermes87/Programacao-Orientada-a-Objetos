import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {


        Scanner teclado = new Scanner(System.in);



        System.out.println("Digite a marca do computador : ");
        String m2 = teclado.nextLine();
        System.out.println("Digite o modelo :");
        String mod2 = teclado.nextLine();
        System.out.println("Tipo de Computador :");
        String t2 = teclado.nextLine();
        System.out.println("Digite o valor :");
        Double p2 = teclado.nextDouble();

        Computador Computador1 = new Computador("Apple", "Macbook", "Notebook", 15000.00);

        Computador Computador2 = new Computador(m2,mod2,t2,p2);

        Pessoa Pessoa1 = new Pessoa("Hermes", 30, "Masculino");

        Livros Livro1 = new Livros("O Senhor dos Anéis", 1954, "J.R.R. Tolkien");


        Computador1.exibirDados();
        Computador2.exibirDados();

        Pessoa1.exibirDadosPessoa();

        Livro1.exibirDadosLivro();

        teclado.close();




    }
}
