public class Principal {
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo("vermelho", true, 5.0, 3.0);
        
        System.out.println("Cor: " + retangulo.getCor());
        System.out.println("Preenchida: " + retangulo.isPreenchida());
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + retangulo.calcularArea());
    }

}
