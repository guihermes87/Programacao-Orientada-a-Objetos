

public class Carro {

    public String marca;
    public String modelo;

    // public void alugar() {
    // System.out.println("O carro de " + marca + " " + modelo + " foi alugado.");
    // }
    // public void devolver() {
    // System.out.println("O carro de " + marca + " " + modelo + " foi devolvido.");
    // }

    // public void exibirCarro(String marca,String modelo) {
    // System.out.println("Dados do veículo : " + marca + " " + modelo);
    // }

    public void atribuirValores(String ma, String mo) {
        marca = ma;
        modelo = mo;
    }

    public Carro(String marcaCarro, String modeloCarro) {

        System.out.println("Estou no construtor da classe Carro e recebi a marca: " + marcaCarro);
        marca = marcaCarro;
        modelo = modeloCarro;

    }

    public Carro(String marca){
        
        System.out.println("Estou no construtor");
        this.marca = marca;
    }

    public String retornaMarca() {
        return marca;
    }

    public String retornaModelo() {
        return modelo;
    }

}
