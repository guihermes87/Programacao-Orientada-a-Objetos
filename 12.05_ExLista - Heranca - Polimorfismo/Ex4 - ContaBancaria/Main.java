public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);
        
        conta.depositar(500.0); // Depósito de R$ 500.0 realizado com sucesso. Saldo atual: R$ 1500.0
        
        conta.setValor(2000.0); // Atualiza o valor da conta para R$ 2000.0
        
        conta.depositar(); // Depósito de R$ 0.0 realizado com sucesso. Saldo atual: R$ 2000.0
    }

}
`