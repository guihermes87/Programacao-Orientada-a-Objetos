import java.util.Scanner;

public class LocadoraVeiculos {



    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Carro Carro1 = new Carro();
        Moto Moto1 = new Moto();
        Moto Moto2 = new Moto();

        String ma, mo;
        int ci;

        System.out.println("Bem-vindo à locadora de veículos!");

        System.out.println("Marca Moto 1");
        Moto1.marca = teclado.nextLine();
        System.out.println("Modelo Moto 1");
        Moto1.modelo = teclado.nextLine();
        System.out.println("Cilindradas Moto 1");
        Moto1.cilindradas = teclado.nextInt();


        System.out.println("Digite os dados da moto 1 : ");
        Moto1.atribuirValores(teclado.nextLine(), teclado.nextLine(), teclado.nextInt());

        System.out.println("Digite os dados da moto 2 : ");
        Moto2.atribuirValores(teclado.nextLine(), teclado.nextLine(), teclado.nextInt());

        System.out.println("Digite os dados do carro : ");
        Carro1.atribuirValores(teclado.nextLine(), teclado.nextLine());

        // System.out.println("Digite os dados da moto 1 :");
        // Moto1.marca = teclado.nextLine();
        // System.out.println("Digite o modelo da moto 1 :");
        // Moto1.modelo = teclado.nextLine();
        // System.out.println("Digite as cilindradas da moto 1 :");
        // Moto1.cilindradas = teclado.nextInt();
        // teclado.nextLine();

        // System.out.println("Digite os dados da moto 2 :");
        // Moto2.marca = teclado.nextLine();
        // System.out.println("Digite o modelo da moto 2 :");
        // Moto2.modelo = teclado.nextLine();
        // System.out.println("Digite as cilindradas da moto 2 :");
        // Moto2.cilindradas = teclado.nextInt();
        // teclado.nextLine();

        // System.out.println("Digite os dados do carro :");
        // Carro1.marca = teclado.nextLine();
        // System.out.println("Digite o modelo do carro :");
        // Carro1.modelo = teclado.nextLine();


        System.out.println("Dados do carro: " + Carro1.retornaMarca() + " " + Carro1.retornaModelo());
        System.out.println("Dados da moto 1: " + Moto1.retornaMarca() + " " + Moto1.retornaModelo() + " " + Moto1.retornaCilindradas() + "cc");
        System.out.println("Dados da moto 2: " + Moto2.retornaMarca() + " " + Moto2.retornaModelo() + " " + Moto2.retornaCilindradas() + "cc");




    }


}
