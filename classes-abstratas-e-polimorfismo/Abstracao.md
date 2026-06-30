Abstração - Deixar de lado, esconder detalhes, mostrar o essencial.

palavra chave abstract antes da classe ou método, projetada para ser extendida.

abstract class Veiculo {
    abstract void acelerar();
}

class Carro extends Veiculo {
    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}

