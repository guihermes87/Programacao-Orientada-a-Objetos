package org.yourcompany.yourproject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Principal {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 2500.0, "NB123", "Valor temporário");
       
        //serialização
        
        try {
            FileOutputStream arquivosaida = new FileOutputStream("produto.ser");
            ObjectOutputStream objetosaida = new ObjectOutputStream(arquivosaida);
            
            objetosaida.writeObject(p1);
            objetosaida.close();
            arquivosaida.close();

        System.out.println("Produto serializado com sucesso!");
        
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Desserialização

        try {

            FileOutputStream arquivoEntrada = new FileOutputStream("produto.ser");
            ObjectOutputStream objetoEntrada = new ObjectOutputStream(arquivoEntrada);
            
            Produto produtoDesserializado = (Produto) objetoEntrada.readObject();
            
            objetoEntrada.close();
            arquivoEntrada.close();

            System.out.println("Produto desserializado: " + produtoDesserializado);
            System.out.println("Null para campo temporário: " + produtoDesserializado.getTemporario());

        } catch (IOException e) {
            e.printStackTrace();
            

    }

}
}
