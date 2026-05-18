
import java.util.InputMismatchException;
import java.util.Scanner;

public class ErroArithmeticException {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int premiacao = 5000.0;


        try {

            System.out.println("Calculando o valor por vencedor...");
            System.out.println("Numero total de vencedores? ");
            int numeroVencedores = teclado.nextInt();

            int valorPorVencedor = premiacao / numeroVencedores;
            System.out.println("Valor por vencedor: " + valorPorVencedor);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida. " + e.toString());
        }   catch (InputMismatchException e) {
                System.out.println("Erro: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
