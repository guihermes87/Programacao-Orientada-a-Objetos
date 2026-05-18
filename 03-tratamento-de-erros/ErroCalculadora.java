import java.util.InputMismatchException;
import java.util.Scanner;

public class ErroCalculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        try {

            System.out.println("Digite 2 números inteiros:");
            int n1 = teclado.nextInt();
            int n2 = teclado.nextInt();

            int soma = n1 + n2;
            System.out.println("A soma dos números é : " + soma);
            int subtracao = n1 - n2;
            System.out.println("A subtração dos números é : " + subtracao);
            int multiplicacao = n1 * n2;
            System.out.println("A multiplicação dos números é : " + multiplicacao);
            
            try {
                int divisao = n1 / n2;
                System.out.println("A divisão dos números é : " + divisao);
            } catch (ArithmeticException e) {
                System.out.println("Não é possível dividir por zero.");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Erro: " + e.toString());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            teclado.close();
        }

}
}
