
package pkg;
import java.util.Scanner;
import pkg.atributos.Carro;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);        
        
        Carro Carro1 = new Carro();
        Carro Carro2 = new Carro();

        System.out.println("Digite o modelo do Veículo 1 :");
        Carro1.modelo = teclado.nextLine();
        System.out.println("Digite o ano do Veículo 1 :");
        Carro1.AnoDeFabricacao = teclado.nextInt();
        teclado.nextLine(); // consome o newline deixado por nextInt()
        System.out.println("Digite a marca do Veículo 1 :");
        Carro1.marca = teclado.nextLine();


        System.out.println("Digite o modelo do Veículo 2 :");
        Carro2.modelo = teclado.nextLine();
        System.out.println("Digite o ano do Veículo 2 :");
        Carro2.AnoDeFabricacao = teclado.nextInt();
        teclado.nextLine(); // consome o newline se for ler nextLine() em seguida
        System.out.println("Digite a marca do Veículo 2 :");
        Carro2.marca = teclado.nextLine();


        System.out.println("Carro1 : Modelo =" + Carro1.modelo + "\nAno de Fabricação : " + Carro1.AnoDeFabricacao + "\nMarca :" + Carro1.marca);
        System.out.println("Carro2 : Modelo =" + Carro2.modelo + "\nAno de Fabricação : " + Carro2.AnoDeFabricacao + "\nMarca :" + Carro2.marca);

        teclado.close();
    }
}