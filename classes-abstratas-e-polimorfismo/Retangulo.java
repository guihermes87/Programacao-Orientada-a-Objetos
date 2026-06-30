public class Retangulo extends Forma {

    public double base;
    public double altura;

    

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double Area() {
        return this.base * this.altura;
    }

    @Override
    public double Perimetro() {
        return 2 * (this.base + this.altura);
    }

}
