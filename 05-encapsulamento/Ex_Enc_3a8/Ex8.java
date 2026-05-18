
import java.util.Scanner;

public class Ex8 {

    private int x;
    private int y;

    public void Retangulo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void inserir_lados(int x, int y) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("descreva o valor do lado x: ");
        x = scanner.nextInt();
        System.out.println("descreva o valor do lado y: ");
        y = scanner.nextInt();
        scanner.close();
    }
    public void calcularArea() {
        int area = x * y;
        System.out.println("Área do retângulo: " + area);
    }

    public static void main(String[] args) {

        Ex8 retangulo = new Ex8();
        retangulo.inserir_lados(20, 20); // Os valores serão inseridos pelo usuário

        retangulo.calcularArea();



    }

}
