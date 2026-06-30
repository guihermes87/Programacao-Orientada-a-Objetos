public class Triangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {

        super(base, altura);
    }


    
    void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
    }

}
