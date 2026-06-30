public class Principal {

    public static void main(String[] args) {
        Carro carro1 = new Carro(0, 120);
        
        carro1.acelerar(30);
        
        System.out.println("Velocidade atual: " + carro1.Velocidadeatual + " km/h");
        
        carro1.acelerar(150);
        
        System.out.println("Velocidade atual: " + carro1.Velocidadeatual + " km/h");
        
        carro1.frear(0);
        
        System.out.println("Velocidade atual: " + carro1.Velocidadeatual + " km/h");
        
        if (carro1.atingiuVelocidadeMaxima()) {
            System.out.println("O carro atingiu a velocidade máxima.");
        } else {
            System.out.println("O carro não atingiu a velocidade máxima.");
        }
    
        System.out.println("Calculando tempo de viagem para 240 km...");
        carro1.calcularTempoViagem(2400);
}
}