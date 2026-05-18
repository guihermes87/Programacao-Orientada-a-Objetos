import java.util.Scanner;

public class ErroConversaodeValores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Digite uma palavra");
            String palavra = teclado.nextLine();

            //CONVERTER STRING PARA DOUBLE;
            double valor = Double.parseDouble(palavra);
            System.out.println("O valor digitado é : " + valor);

        } catch (NumberFormatException e) {
            System.out.println("Não é possível converter palavras em numeros: " + e.toString());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            teclado.close();
        }

    }

}
