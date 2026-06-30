package ContaBancaria;

public class Principal {

    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente();
        
        contaCorrente.saldo = 1000.0;
        contaCorrente.limite = 500.0;

        contaCorrente.Depositar();
        contaCorrente.Sacar();

        ContaInvestimento contaInvestimento = new ContaInvestimento();

        contaInvestimento.saldo = 2000.0;
        contaInvestimento.limite = 5000;

        contaInvestimento.Depositar();
        contaInvestimento.Sacar();
    }

}
