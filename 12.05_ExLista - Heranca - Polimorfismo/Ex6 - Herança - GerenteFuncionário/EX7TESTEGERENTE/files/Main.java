import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n===== MENU FUNCIONÁRIOS =====");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Desenvolvedor");
            System.out.println("3 - Listar todos");
            System.out.println("4 - Aplicar aumento geral (10%)");
            System.out.println("5 - Exibir salário final de cada funcionário");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nomeG = sc.nextLine();
                    System.out.print("Salário: ");
                    double salG = sc.nextDouble();
                    System.out.print("Bônus anual: ");
                    double bonus = sc.nextDouble();
                    sc.nextLine();
                    lista.add(new Gerente(nomeG, salG, bonus));
                    System.out.println("Gerente cadastrado!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeD = sc.nextLine();
                    System.out.print("Salário: ");
                    double salD = sc.nextDouble();
                    System.out.print("Horas extras: ");
                    int horas = sc.nextInt();
                    sc.nextLine();
                    lista.add(new Desenvolvedor(nomeD, salD, horas));
                    System.out.println("Desenvolvedor cadastrado!");
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        System.out.println("\n--- Lista de Funcionários ---");
                        for (Funcionario f : lista) {
                            System.out.println(f); // toString() polimórfico
                        }
                    }
                    break;

                case 4:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario f : lista) {
                            f.setSalario(f.getSalario() * 1.10);
                        }
                        System.out.println("Aumento de 10% aplicado a todos!");
                    }
                    break;

                case 5:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        System.out.println("\n--- Salário Final por Funcionário ---");
                        for (Funcionario f : lista) {
                            System.out.println(f.getNome()
                                + " | Tipo: "          + f.getClass().getSimpleName()
                                + " | Salário final: R$ " + String.format("%.2f", f.calcularSalarioFinal()));
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
