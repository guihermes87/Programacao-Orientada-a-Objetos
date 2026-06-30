public class Ex7 {

    private String placa;
    private int numChassi;

    public Ex7(String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public boolean frear() {
        System.out.println("O carro está freando.");
        return true;
    }



}
