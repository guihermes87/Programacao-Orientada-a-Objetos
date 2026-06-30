import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        ContaCorrente conta1 = new ContaCorrente();

        System.out.println("Saldo inicial da Conta Corrente: ");
        float valorInicial = teclado.nextFloat();
        
        conta1.definirSaldoInicial(valorInicial);
        

       while (conta1.saldo > 0) {
        System.out.println("Deseja depositar ou sacar? 1 para saque 2 para depósito");
        String escolha = teclado.next();

        if (escolha.equals("1")) {
            System.out.println("Valor para saque: ");
            float valorSaque = teclado.nextFloat();
            conta1.sacarValor(valorSaque);
        } else if (escolha.equals("2")) {
            System.out.println("Valor para depósito: ");
            float valorDeposito = teclado.nextFloat();
            conta1.depositarValor(valorDeposito);
        } else {
            System.out.println("Opção inválida.");
        }

        System.out.println("Saldo final da Conta Corrente: " + conta1.saldo);
    
    } 
        System.out.println("Saldo insuficiente para realizar operações.");
    }
    }


