
import java.util.Scanner;

public class Principal {

public static void main(String[] args) throws MinhaExcecao {
    


Scanner scanner = new Scanner(System.in);
double n1,n2;

System.out.println("Digite dois números para divisão: ");
n1 = scanner.nextDouble();
n2 = scanner.nextDouble();

divide(n1, n2);

}

public static void divide(double n1, double n2) throws MinhaExcecao {
    if (n2 == 0) {
        throw new MinhaExcecao("Divisão por zero não é permitida.");
    }
    double resultado = n1 / n2;
    System.out.println("Resultado: " + resultado);
}
}