import java.util.Scanner;
import Aluno;

public class Principal {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome do aluno: ");
    String nome = scanner.nextLine();

    System.out.print("Digite a matrícula do aluno: ");
    String matricula = scanner.nextLine();

    System.out.print("Digite a nota 1: ");
    double nota1 = scanner.nextDouble();

    System.out.print("Digite a nota 2: ");
    double nota2 = scanner.nextDouble();

    System.out.print("Digite a nota 3: ");
    double nota3 = scanner.nextDouble();

    Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

    double media = aluno.calcularMedia();

    System.out.println("\nDados do Aluno:");
    System.out.println("Nome: " + nome);
    System.out.println("Matrícula: " + matricula);
    System.out.println("Média: " + media);

    if (media >= 6) {
        System.out.println("Status: Aprovado");
    } else {
        System.out.println("Status: Reprovado");
    }


}

}
