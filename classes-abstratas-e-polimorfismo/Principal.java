

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        
        // Animal a = new Cachorro();
        // Animal b = new Tigre();
        
        // a.emiteSom();
        // b.emiteSom();
    

    Scanner teclado = new Scanner(System.in);

    
    int opcao;
    
    System.out.println("Digite 1 para instanciar um cachorro ou 2 para instanciar um tigre");
    opcao = teclado.nextInt();

    if (opcao == 1) {
        Cachorro d = new Cachorro();
        d.especie = "Cachorro";
        d.idade = 5;
        d.raca = "Labrador";
        d.exibeInfo();
        d.emiteSom();
        d.cuidarPatio();
        
    
    } else  {
        Tigre d = new Tigre();
        d.especie = "Tigre";
        d.idade = 3;
        d.exibeInfo();
        d.emiteSom();    
    }
        
    
    
        teclado.close();

    
    }
}
