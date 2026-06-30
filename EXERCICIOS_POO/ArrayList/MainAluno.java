import java.util.ArrayList;
import java.util.List;

public class MainAluno {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("João", 8.5, 7.0);
        Aluno aluno2 = new Aluno("Maria", 9.0, 8.5);
        Aluno aluno3 = new Aluno("Pedro", 7.5, 6.0);

        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);

         MediaAlunos(listaAlunos);
           
    }

    public static void MediaAlunos(List<Aluno> lista){
        for (Aluno aluno : lista) {
            double media = (aluno.getNota1() + aluno.getNota2()) / 2;
            System.out.println("Aluno: " + aluno.getNome() + ", Média: " + media);
        }
    }
    
}
