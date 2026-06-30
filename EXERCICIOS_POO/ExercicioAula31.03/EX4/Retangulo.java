public class Retangulo {

    public double base;
    public double altura;
    public double perimetro;
    public double areatotal;
    public double diagonal;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    void calcularArea() {    
        
        areatotal = base * altura;
        System.out.println(areatotal);

    }

    void calcularPerimetro() {
        
        perimetro = 2 * (base + altura);
         System.out.println(perimetro);
        
    }

    //calcularDiagonal(), que calcula e retorna a diagonal utilizando a função Math.sqrt(), e ehQuadrado(), 
    // que retorna true caso a largura seja igual à altura.

    void calcularDiagonal() {
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        System.out.println(diagonal);
    }
    
    public boolean ehQuadrado() {
        return base == altura;
    }
}   


