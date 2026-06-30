package Veiculo;

public class Principal {

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.acelerar();
        carro.frear();

        Moto moto = new Moto();
        moto.acelerar();
        moto.frear();
    }

}
