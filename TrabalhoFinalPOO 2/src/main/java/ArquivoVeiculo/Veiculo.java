
package ArquivoVeiculo;

import java.util.List;
import java.util.Scanner;

public class Veiculo {

    private String placa;
    private String modelo;
    private String marca;
    private int anodeFabricacao;
    private double kilometragem;



    public Veiculo(String placa, String modelo, String marca, int anodeFabricacao, double kilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anodeFabricacao = anodeFabricacao;
        this.kilometragem = kilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnodeFabricacao() {
        return anodeFabricacao;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    Scanner scanner = new Scanner(System.in);

    public void cadastrar(Arquivo arquivo, List<Veiculo> listaVeiculos) {
        System.out.println("Digite a placa do veículo:");
        String placa = scanner.nextLine();
        System.out.println("Digite o modelo do veículo:");
        String modelo = scanner.nextLine();
        System.out.println("Digite a marca do veículo:");
        String marca = scanner.nextLine();
        System.out.println("Digite o ano de fabricação do veículo:");
        int anodeFabricacao = scanner.nextInt();
        System.out.println("Digite a quilometragem do veículo:");
        double kilometragem = scanner.nextDouble();
        scanner.nextLine(); 

        Veiculo veiculo = new Veiculo(placa, modelo, marca, anodeFabricacao, kilometragem);
        listaVeiculos.add(veiculo);          
        arquivo.gravarArquivo(veiculo);

        System.out.println("Veículo cadastrado com sucesso!");
        listar(listaVeiculos);
    } 


    public void listar(List<Veiculo> veiculos) {
        System.out.println("\nVeículos cadastrados:");
        
        for (Veiculo v : veiculos) {
            System.out.println("Placa: " + v.getPlaca()
                    + ", Modelo: " + v.getModelo()
                    + ", Marca: " + v.getMarca()
                    + ", Ano de Fabricação: " + v.getAnodeFabricacao()
                    + ", Quilometragem: " + v.getKilometragem());
        }
    }

  
}