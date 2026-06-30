public class ContaCorrente {

    public float saldo;


    void definirSaldoInicial(float valor) {
        this.saldo = valor;
    }
    
    void depositarValor(float valor) {
        this.saldo += valor;
    }

    public boolean sacarValor(float valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }


}
