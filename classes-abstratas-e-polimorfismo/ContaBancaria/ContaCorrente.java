package ContaBancaria;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }



        @Override
        public void Sacar() {
                if (saldo + limite >= 0) {
                        System.out.println("Saque realizado com sucesso!");
                } else {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                }
                System.out.println("Saque realizado com sucesso!");
        }
        
        @Override
        public void Depositar() {
                if (saldo + limite >= 0) {
                        System.out.println("Depósito realizado com sucesso!");
                } else {
                        System.out.println("Saldo insuficiente para realizar o depósito.");
                }
                System.out.println("Depósito realizado com sucesso!");
        }



}
