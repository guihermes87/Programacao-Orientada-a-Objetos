public class Boletim extends Aluno {

    public Boletim(String Nome, double notaFinal) {
        super(Nome, notaFinal);
    }
    
    public void imprimirStatus(double notaFinal) {
        if (notaFinal < 60) {
            System.out.println("Reprovado");
        } else if (notaFinal >= 60 && notaFinal < 70) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
    }
}
