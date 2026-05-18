public class Aluno {
    
    private String Nome;
    private double notaFinal;

    public Aluno(String Nome, double notaFinal) {
        this.Nome = Nome;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return Nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    

}   
