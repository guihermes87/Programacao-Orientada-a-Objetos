public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public boolean aprovado;
    public double mediaAluno;
    public double maiorNota;
    

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    void CalcularMedia() {

        double valorNotas = nota1 + nota2+ nota3;
        double mediaAluno = valorNotas/3; 
        System.out.println(mediaAluno);
    
    }

    

    boolean temAprovacao() {
        if (mediaAluno >= 7) {
            aprovado = true;
        } else {
            aprovado = false;
        }
        return aprovado;
    }

    double maiorNota(double nota1, double nota2, double nota3) {
        if (nota1 > nota2 && nota1 > nota3) {
            maiorNota = nota1;
        } else if (nota2 > nota1 && nota2 > nota3) {
            maiorNota = nota2;
        } else {
            maiorNota = nota3;
        }
        return maiorNota;
    }
}   

