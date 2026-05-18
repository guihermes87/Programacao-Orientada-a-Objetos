import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario(50, "João", 2000);
        funcionario1.horasTrabalhadas = 10;
        funcionario1.calcularValorHoraExtra();
        funcionario1.calcularPagamentoTotal();

        System.out.println("Quantas horas extras deseja adicionar? ");
        int horasExtras = teclado.nextInt();

        funcionario1.adicionarhorasExtras(horasExtras);


    }

}
