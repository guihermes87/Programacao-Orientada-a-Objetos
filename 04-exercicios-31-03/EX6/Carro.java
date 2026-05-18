

public class Carro {

public int Velocidadeatual;
public int Velocidademaxima;
public double distancia;

public Carro (int Velocidadeatual, int Velocidademaxima) {
    this.Velocidadeatual = Velocidadeatual;
    this.Velocidademaxima = Velocidademaxima;
}

void acelerar (int aceleracao) {
    if (Velocidadeatual + aceleracao > Velocidademaxima) {
        System.out.println("Aceleração excede a velocidade máxima. Acelerando até a velocidade máxima.");
        Velocidadeatual = Velocidademaxima;
    } else {
        Velocidadeatual += aceleracao;
    }

}

void frear (int frenagem) {
    if (Velocidadeatual - frenagem < 0) {
        System.out.println("Frenagem excede a velocidade atual. Freando até parar.");
        Velocidadeatual = 0;
    } else {
        Velocidadeatual -= frenagem;
    }
}

boolean atingiuVelocidadeMaxima() {
    if (Velocidadeatual == Velocidademaxima) {
        return true;
    } else {
        return false;
    }


}
    void calcularTempoViagem(double distancia){
        double tempo;
        tempo = distancia/Velocidadeatual;
        System.out.println("Tempo estimado de viagem: " + tempo + " horas");

    }

}