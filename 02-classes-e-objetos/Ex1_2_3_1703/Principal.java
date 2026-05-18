
public class Principal {

public static void main(String[] args) {

//     Disciplina disciplina1 = new Disciplina("Matemática", "Professor A", 60);

//     Scanner teclado = new Scanner(System.in);

//     String nome, nomeDoProfessor;
//     int cargaHoraria;

//     System.out.println("Nome da disciplina:");
//     disciplina1.nome = teclado.nextLine();
//     System.out.println("Nome do professor:");
//     disciplina1.nomeDoProfessor = teclado.nextLine();
//     System.out.println("Carga horária:");
//     disciplina1.cargaHoraria = teclado.nextInt();

//     System.out.println("Disciplina: " + disciplina1.nome);
//     System.out.println("Professor: " + disciplina1.nomeDoProfessor);
//     System.out.println("Carga Horária: " + disciplina1.cargaHoraria + " horas");

//     System.out.println("Digite o nome da disciplina:");
//     nome = teclado.nextLine();
//     System.out.println("Digite o nome do professor:");
//     nomeDoProfessor = teclado.nextLine();
//     System.out.println("Digite a carga horária:");
//     cargaHoraria = teclado.nextInt();

//     System.out.println("Disciplina: " + nome + ", Professor: " + nomeDoProfessor + ", Carga Horária: " + cargaHoraria + " horas");


// }

Livro livro1 = new Livro("O senhor dos aneis", "J.R.R. Tolkien", 1954, "Fantasia");
livro1.emprestado = false;

livro1.informacoesDoLivro();
livro1.emprestarLivro();
livro1.informacoesDoLivro();
livro1.devolverLivro();



}

}
