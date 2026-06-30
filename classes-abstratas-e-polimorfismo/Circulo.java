public class Circulo extends Forma {

    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double Area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double Perimetro() {
        return 2 * Math.PI * this.raio;
    }

}
