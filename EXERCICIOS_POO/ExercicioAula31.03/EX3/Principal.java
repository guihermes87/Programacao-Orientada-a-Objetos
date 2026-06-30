public class Principal {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("João", 6, 7, 8);
    
        aluno1.CalcularMedia();
        
        System.out.println("Aluno foi aprovado? " + aluno1.temAprovacao());
        System.out.println("A maior nota do Aluno foi: " + aluno1.maiorNota(aluno1.nota1, aluno1.nota2, aluno1.nota3));



    }

}
