public class Retangulo extends Figura {
    
    private double largura;
    private double altura;

    public Retangulo(String cor, boolean preenchida, double largura, double altura) {
        super(cor, preenchida);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea() {
        return largura * altura;
    }

}
