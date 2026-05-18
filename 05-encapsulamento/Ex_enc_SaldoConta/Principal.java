//"1 - Crie uma classe ContaBancaria que possua os atributos saldo e limite. Proteja os atributos 
// utilizando encapsulamento. Crie os métodos get e set para cada atributo. 
// Crie um método saque que permita ao usuário sacar um valor da conta, desde que não ultrapasse o limite da conta. 
// Faça leitura pelo teclado."


import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        

        ContaBancaria Conta01 = new ContaBancaria(5000, 10000);

        System.out.println("Extrato Bancário");
        System.out.println("Seu saldo atual é " + Conta01.getSaldo());
        System.out.println("Seu limite é de :" +Conta01.getSaldo());

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que deseja sacar :");
        double sa = sc.nextDouble();

        Conta01.sacarValor(sa);

         System.out.println("Digite o valor que deseja depositar :");
        double de = sc.nextDouble();

        Conta01.depositarValor(de);

         System.out.println("Seu saldo atual é " + Conta01.getSaldo());
         System.out.println("Seu limite é de :" +Conta01.getSaldo());


    }

}
