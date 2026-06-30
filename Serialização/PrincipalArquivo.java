import java.util.Scanner;

public class PrincipalArquivo {

    public static void main(String[] args) {
    
        
        // List<Aluno> lista = new ArrayList<>();

        Arquivo arquivo = new Arquivo("alunos");

        Scanner scanner = new Scanner(System.in);

        int opcao;
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Gravar dados dos alunos no arquivo");
        System.out.println("2 - Ler dados dos alunos do arquivo");
        opcao = scanner.nextInt();
       
        scanner.nextLine(); // Limpa o buffer do scanner
        
        switch (opcao) {
            case 1:
                
                System.out.println("Insira o nome do aluno:");
                String nome = scanner.nextLine();
                System.out.println("Insira a idade do aluno:");
                int idade = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do scanner
                Aluno aluno = new Aluno(nome, idade);
                arquivo.gravarArquivo(aluno);
                System.out.println("Dados do aluno foram gravados no arquivo com sucesso!");
                break;
            
            
            case 2:

                for (Aluno a : arquivo.lerArquivo()) {
                    System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
                }
                break;

            default:
                throw new AssertionError();
        
            } while (true); 
       
        
        
    }

}
