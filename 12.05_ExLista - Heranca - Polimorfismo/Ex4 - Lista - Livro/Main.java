import java.util.ArrayList;
import java.util.Comparator;

public class Main {

public static void main(String[] args) {
    
Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
Livro livro3 = new Livro("O Código Da Vinci", "Dan Brown", 2003);

ArrayList<Livro> biblioteca = new ArrayList<>();

biblioteca.add(livro1);
biblioteca.add(livro2);
biblioteca.add(livro3);

biblioteca.sort(Comparator.comparingInt(Livro::getAno));

for (Livro livro : biblioteca) {
    System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " (" + livro.getAno() + ")");
}

}
}

