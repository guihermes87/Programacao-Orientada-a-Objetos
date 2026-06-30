import java.util.Scanner;


public class ErroStringparaDoubleTemperatura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Digite a temperatura em Celsius:");
            String celsius = teclado.nextLine();

            //CONVERTER STRING PARA DOUBLE;
            double valorCelsius = Double.parseDouble(celsius);
            double valorFahrenheit = (valorCelsius * 9/5) + 32;
            System.out.println("A temperatura em Fahrenheit é : " + valorFahrenheit);
            
        } catch (NumberFormatException e) {
            System.out.println("Não é possível converter palavras em numeros: " + e.toString());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            teclado.close();
        }

    }

}
