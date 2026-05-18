import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Funcionario funcionario = new Funcionario(3000);

        
        
        System.out.println("Digite o salário do gerente:");
        double salario = (scanner.nextDouble());
        System.out.println("Digite o bônus do gerente:");
        double bonus = (scanner.nextDouble());

        Gerente gerente = new Gerente (salario,bonus);
        
        System.out.println("Salário do Funcionário: " + funcionario.calcularSalario());
        System.out.println("Salário do Gerente: " + gerente.calcularSalario(gerente.getSalario()));
        
        scanner.close();
    }

    

}
