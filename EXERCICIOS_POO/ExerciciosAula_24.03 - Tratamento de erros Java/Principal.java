import java.util.InputMismatchException;
import java.util.Scanner;

// public class Principal {
//     public static void main(String[] args) {
// ARRAY INDEX OUT OF BOUNDS EXCEPTION VETOR FORA DO LIMITE
//         int[] numeros = {10, 20, 30};
//         System.out.println(numeros[3]);
//     }

// }

// public class Principal {
//     public static void main(String[] args) {

//DIVISÃO POR ZERO ERRO ARITHMETIC EXCEPTION
//         int a = 10;
//         int b = 0;
//         System.out.println(a / b);
//     }

// }

// public class Principal {
//     public static void main(String[] args) {

//NUMBER FORMAT EXCEPTION ERRO DE FORMATO DE NÚMERO
//         String numero = "abc";
//         int valor = Integer.parseInt(numero);
//         System.out.println(valor);
//     }

// }

// public class Principal {
//     public static void main(String[] args) {

//         try {
//             int[] numeros = {10, 20, 30};
//             System.out.println(numeros[3]);

//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Erro: índice fora do Array" + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("Erro: " + e.getMessage());
//         }

//     }

// }

// public class Principal {
//     public static void main(String[] args) {

//         try {
//             int a = 10;
//             int b = 0;
//             System.out.println(a / b);

//         } catch (ArithmeticException e) {
//             System.out.println("Erro: divisão por zero" + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("Erro: " + e.getMessage());
//         }

//     }

// }

// public class Principal {
//     public static void main(String[] args) {

//         try {
//             String numero = "abc";
//             int valor = Integer.parseInt(numero);
//             System.out.println(valor);

//         } catch (NumberFormatException e) {
//             System.out.println("Erro: formato de número inválido " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("Erro: " + e.getMessage());
//         }

//     }

// }

// public class Principal {
//     public static void main(String[] args) {

//         Scanner teclado = new Scanner(System.in);
//         try {

//             System.out.println("Digite um número inteiro:");
//             int numero = teclado.nextInt();

//             // raiz quadrada do numero digitado;

//             int resultado = (int) Math.sqrt(numero);

//             System.out.println("A raiz quadrade do número é : " + resultado);

//         } catch (InputMismatchException e) {
//             System.out.println("Por favor, digite um número inteiro ");
//         } catch (Exception e) {
//             System.out.println("Erro: " + e.getMessage());
//         } finally {
//             teclado.close();
//         }

//     }

// }

public class Principal {
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