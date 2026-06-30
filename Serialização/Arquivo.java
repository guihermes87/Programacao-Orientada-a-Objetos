
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    
    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;
    private List<Aluno> listaAlunos;
    public String nomeArquivo;

        public Arquivo(String nomeArquivo) {
            this.nomeArquivo = nomeArquivo;
            this.listaAlunos = new ArrayList<>();
        }
    
        public void gravarArquivo(Aluno a) {
            
            try {
                arqw = new FileWriter(nomeArquivo + "txt", true);
                escritor = new BufferedWriter(arqw);
                escritor.write(a.getNome() + "," + a.getIdade());
                escritor.newLine();
                
                escritor.close();
                arqw.close();
            
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
            }
        }

        public List<Aluno> lerArquivo() {
            
            try {
                arqr = new FileReader(nomeArquivo + "txt");
                leitor = new BufferedReader(arqr);
                String linha;
                while ((linha = leitor.readLine()) != null) {
                    
                    String[] campos = linha.split(",");
                    String nome = campos[0];
                    int idade = Integer.parseInt(campos[1]);
                    
                    listaAlunos.add(new Aluno(nome, idade));
                }
                leitor.close();
                arqr.close();

            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
            }
            return listaAlunos;
        }


}
