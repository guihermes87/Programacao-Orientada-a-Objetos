public class ContaBancaria {

    private double saldo;


    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    void consultarSaldo() {

        System.out.println("Saldo atual: R$ " + this.saldo);
    }

}
