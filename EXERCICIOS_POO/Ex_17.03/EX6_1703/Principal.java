public class Principal {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "12345");
        Aluno aluno2 = new Aluno("01/01/2000");
        Aluno aluno3 = new Aluno("Maria", "15/05/1999", 2018);

        System.out.println("Aluno 1: " + aluno1);
        System.out.println("Aluno 2: " + aluno2);
        System.out.println("Aluno 3: " + aluno3);
    }
}
