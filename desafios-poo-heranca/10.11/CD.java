public class CD  implements Produto {

    private String nome;
    private double preco;
    private String descricao;

    public CD(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public void getNome() {
        System.out.println("Nome do CD: " + nome);
    }

    @Override
    public void getPreco() {
        System.out.println("Preço do CD: R$ " + preco);
    }

    @Override
    public void getDescricao() {
        System.out.println("Descrição do CD: " + descricao);
    }

}
