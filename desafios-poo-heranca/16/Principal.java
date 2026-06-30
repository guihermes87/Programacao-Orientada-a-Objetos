public class Principal {

    public static void main(String[] args) throws IllegalArgumentException {
        Triangulo triangulo1 = new Triangulo(20, 4, 5);
        Triangulo triangulo2 = new Triangulo(1, 2, 3);

        System.out.println("Triângulo 1:");
        triangulo1.validarTriangulo();

        System.out.println("Triângulo 2:");
        triangulo2.validarTriangulo();
    }

}
