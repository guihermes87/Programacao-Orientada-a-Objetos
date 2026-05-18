



public class Principal {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno ("Alberto", 70, 80);

        System.out.println("Aluno :" + aluno1.getNome());
        System.out.println("Nota 1 : " +aluno1.getNota1());
        System.out.println("Nota 2: " +aluno1.getNota2());

        aluno1.calcularMedia();


    }

}
