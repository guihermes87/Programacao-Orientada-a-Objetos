public class FormaGeometrica {

        private double base;
        private double altura;

    

    public FormaGeometrica(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }



    void CalcularArea() {
        double area = base * altura;
        System.out.println("Área da forma geométrica: " + area);
    }

}
