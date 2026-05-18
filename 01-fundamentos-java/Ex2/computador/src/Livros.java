public class Livros {

    public String titulo;
    public int anoPublicacao;
    public String autor;

    public Livros(String titulo, int anoPublicacao, String autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;

    }
    public void exibirDadosLivro() {
        System.out.println("Título do Livro: " + titulo + " | Ano de Lançamento: " + anoPublicacao +
                           " | Autor : " + autor);
    }
}
