


public class Onibus extends Carro {

private String modelo;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void exibeMsg () {
        System.out.println("Estou dentro da classe ônibus");
        System.out.println("O ônibus é " +this.nome);
        System.out.println("O modelo do ônibus é " +this.modelo);
    }
}
