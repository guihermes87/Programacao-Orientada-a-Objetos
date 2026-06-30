public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 85);
        Boletim boletim1 = new Boletim(aluno1.getNome(), aluno1.getNotaFinal());
        
        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Nota Final: " + aluno1.getNotaFinal());
        System.out.print("Status: ");
        boletim1.imprimirStatus(aluno1.getNotaFinal());


    }
}
