



public class ContaBancaria {

    private double saldo;
    private double limite;

    public ContaBancaria(double limite, double saldo) {
        this.limite = limite;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

     public void sacarValor(double sa) {
        
        if (sa <= limite) {
            double sacar =- saldo;
            System.out.println("Saque realizado, saldo atual é :" +sacar);
        } else {
            System.out.println("Saque não permitido, limite ultrapassado.");
        }
    }

    public void depositarValor(double de) {
        
        double depositar =+ saldo;
        System.out.println("Depósito realizado, saldo atual é :" +depositar);

        }
}
