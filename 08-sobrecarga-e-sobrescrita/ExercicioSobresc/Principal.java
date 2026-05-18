import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
       Pessoa Pessoa;
        
    
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 1 para pessoa");
        System.out.println("Digite 2 para programador");

        int op = teclado.nextInt();
        
        if (op == 1) {

            Pessoa = new Pessoa();
            Pessoa.trabalhar();
        }
        
        if (op == 2) {

            Pessoa = new Programador();
            Pessoa.trabalhar();
        }



}
}