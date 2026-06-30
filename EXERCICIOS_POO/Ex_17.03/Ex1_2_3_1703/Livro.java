
public class Livro {

public String titulo;
public String autor;
public int anoPublicacao;
public String genero;
public boolean emprestado;



public Livro(String titulo, String autor, int anoPublicacao, String genero) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    this.genero = genero;
    this.emprestado = false; // O livro começa como não emprestado
}

void informacoesDoLivro() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Ano de Publicação: " + anoPublicacao);
    System.out.println("Gênero: " + genero);
    System.out.println("Emprestado: " + (emprestado ? "Sim" : "Não"));
}

void emprestarLivro() {
    if (!emprestado) {
        emprestado = true;
        System.out.println("O livro '" + titulo + "' foi emprestado.");
    } else {
        System.out.println("O livro '" + titulo + "' já está emprestado.");
    }
}

void devolverLivro() {
    if (emprestado) {
        emprestado = false;
        System.out.println("O livro '" + titulo + "' foi devolvido.");
    } else {
        System.out.println("O livro '" + titulo + "' não estava emprestado.");
    }
}

}