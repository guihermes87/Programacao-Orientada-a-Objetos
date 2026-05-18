//Crie uma classe Casa com um método calcularPreco(int tamanho) que retorna o preço da casa com base no tamanho em metros quadrados. Sobrecarregue o método calcularPreco() para aceitar um número de quartos
//  e retornar o preço da casa com base no tamanho e no número de quartos.

public class Casa {

    public double calcularPreco(int tamanho) {
        return tamanho * 1000; // Preço base de R$ 1000 por metro quadrado
    }

    public double calcularPreco(int tamanho, int numeroQuartos) {
        double precoBase = calcularPreco(tamanho);
        double precoQuartos = numeroQuartos * 5000; // Adiciona R$ 5000 por quarto
        return precoBase + precoQuartos;
    }
}
