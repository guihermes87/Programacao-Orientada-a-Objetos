

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Carro Carro4 = new Carro("FORD");
        System.out.println("A marca do carro é: " + Carro4.marca);
        
        Carro carro1 = new Carro("Fiat", "Uno");
        System.out.println("A marca do carro é: " + carro1.marca + " e o modelo é: " + carro1.modelo);

        String marca, modelo;

        System.out.println("Digite a marca do carro:");
        marca = teclado.nextLine();
        System.out.println("Digite o modelo do carro:");
        modelo = teclado.nextLine();

        Carro carro2 = new Carro(marca, modelo);
        System.out.println("A marca do carro é: " + carro2.marca + " e o modelo é: " + carro2.modelo);

        System.out.println("Digite a marca e modelo do carro 3 :");
        Carro carro3 = new Carro(teclado.nextLine(), teclado.nextLine());
        System.out.println("A marca do carro é: " + carro3.marca + " e o modelo é: " + carro3.modelo);

        


    }
}
    
//         // System.out.println("Digite a marca do carro:");
//         // carro1.marca = teclado.nextLine();
//         // System.out.println("Digite o modelo do carro:");
//         // carro1.modelo = teclado.nextLine();

        
//         // carro1.exibirCarro();
//         // carro1.alugar();
//         // carro1.devolver();

//         Calculadora calc = new Calculadora();
        
//         // calc.a = 4.37;
//         // calc.b = 4.37;
        
//         double resultado;
//         resultado = calc.somar(4.89, 4.56);
//         System.out.println("O resultado da soma é: " + resultado);

//         // System.out.println("O resultado da soma é: " + calc.somar());
        

//         teclado.close();

//     }

