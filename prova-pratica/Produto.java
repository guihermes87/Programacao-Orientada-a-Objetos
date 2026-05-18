public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor vazio
    public Produto() {
        this.nome = "";
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }

    // Construtor informando apenas o nome
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }

    // Construtor informando nome e preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método para exibir todas as informações do produto
    public void exibirInformacoes() {
        System.out.println("----- Informações do Produto -----");
        System.out.println("Nome: " + this.nome);
        System.out.printf("Preço: R$ %.2f%n", this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);
        System.out.println("----------------------------------");
    }
}
