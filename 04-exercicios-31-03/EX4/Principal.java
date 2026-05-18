

public class Principal {

    public static void main(String[] args) {

        Retangulo Retangulo1 = new Retangulo(20,20);

        Retangulo1.calcularArea();

        Retangulo1.calcularPerimetro();

        Retangulo1.calcularDiagonal();

        System.out.println("Retangulo1 é quadrado? " +Retangulo1.ehQuadrado());

    }

}
