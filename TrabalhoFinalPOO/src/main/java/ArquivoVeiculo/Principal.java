package ArquivoVeiculo;

import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo("veiculos");
        List<Veiculo> listaVeiculos = arquivo.lerArquivo();
        Veiculo veiculo = new Veiculo("", "", "", 0, 0.0);

        int opcao = -1;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Alterar Kilometragem do veículo");
            System.out.println("3 - Excluir veículo");
            System.out.println("4 - Sair do sistema");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1: {
                    veiculo.cadastrar(arquivo, listaVeiculos);
                    System.out.println("Veículo cadastrado com sucesso!");
                    break;
                }

                case 2:

                    System.out.print("Digite a placa do veículo: ");
                    String alterarplaca = scanner.nextLine();

                    boolean encontrado = false;

                    for (Veiculo v : listaVeiculos) {

                        if (v.getPlaca().equalsIgnoreCase(alterarplaca)) {

                            System.out.print("Nova Kilometragem: ");
                            double novaKm = scanner.nextDouble();
                            scanner.nextLine();

                            v.setKilometragem(novaKm);

                            arquivo.regravarArquivo(listaVeiculos);

                            System.out.println("Quilometragem atualizada!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Veículo não encontrado.");
                    }

                    break;

                case 3: {
                    System.out.print("Digite a placa do veículo: ");
                    String placaExcluir = scanner.nextLine();

                    encontrado = false;

                    for (Veiculo v : listaVeiculos) {

                        if (v.getPlaca().equalsIgnoreCase(placaExcluir)) {

                            listaVeiculos.remove(v);

                            arquivo.regravarArquivo(listaVeiculos);

                            System.out.println("Veículo removido com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Veículo não encontrado.");
                    }

                    break;
                }

                case 4: {
                    System.out.println("Saindo do sistema...");
                    break;
                }
            }
        } while (opcao != 4);
    }
}