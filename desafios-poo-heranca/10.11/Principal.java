public class Principal {

    public static void main(String[] args) {
        
        Livro livro1 = new Livro("O Senhor dos Anéis", 49.90, "Uma aventura épica na Terra Média.");
        CD cd1 = new CD("Thriller", 29.90, "O álbum mais vendido de todos os tempos, por Michael Jackson.");

        System.out.println("Informações do Livro:");
        livro1.getNome();
        livro1.getPreco();
        livro1.getDescricao();

        System.out.println("\nInformações do CD:");
        cd1.getNome();
        cd1.getPreco();
        cd1.getDescricao();
    }

}
