public class ContaCorrente extends Conta {


    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteExepction {
        
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteExepction();
        }
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) throws SaldoInsuficienteExepction {
        
        if (valor <= 0) {
            throw new SaldoInsuficienteExepction("Valor de depósito deve ser positivo.");
        }

        else if (valor <=0){
            throw new SaldoInsuficienteExepction("Valor de depósito deve ser positivo.");   
        }

        saldo += valor;
    }

}

