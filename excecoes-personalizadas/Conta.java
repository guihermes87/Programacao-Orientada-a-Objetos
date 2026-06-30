
public abstract class Conta {

    protected double saldo;
    protected double limite;

    public abstract void sacar(double valor) throws SaldoInsuficienteExepction;
    public abstract void depositar(double valor) throws SaldoInsuficienteExepction;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

     public double getSaldo() {
        return saldo;
    }

}
