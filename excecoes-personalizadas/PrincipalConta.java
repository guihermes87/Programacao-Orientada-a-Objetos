public class PrincipalConta {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente(1000, 500);

        try {
            conta.sacar(1200);
            System.out.println("Saque realizado com sucesso. Saldo atual: " + conta.getSaldo());
        } catch (SaldoInsuficienteExepction e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        try {
            conta.depositar(-100);
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + conta.getSaldo());
        } catch (SaldoInsuficienteExepction e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }
    }

}
