public class Principal {

    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo(5.0, 3.0);
        FormaGeometrica forma = new FormaGeometrica(5.0, 3.0);
        
        forma.CalcularArea();
        triangulo.calcularArea();
        
        
        Casa casa = new Casa();
    
        casa.calcularPreco(100);
        casa.calcularPreco(100, 3);
       
        ContaBancaria conta = new ContaBancaria(1000.0);

        conta.consultarSaldo();

        
        
    }

}
