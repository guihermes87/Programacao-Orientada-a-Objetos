public class PrincipalForma {

    public static void main(String[] args) {
        Forma f1 = new Circulo(5);
        Forma f2 = new Retangulo(4, 6);

        System.out.println("Área do círculo: " + f1.Area());
        System.out.println("Perímetro do círculo: " + f1.Perimetro());

        System.out.println("Área do retângulo: " + f2.Area());
        System.out.println("Perímetro do retângulo: " + f2.Perimetro());
    }

}
