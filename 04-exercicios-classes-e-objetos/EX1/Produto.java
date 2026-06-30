public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void calculaValorEstoque() {
        double valorEstoque = preco * quantidade;
        System.out.println("Valor do estoque: " + valorEstoque);
    }

    //temEstoque(), que retorna true se a quantidade for maior que zero e false caso contrário.

    boolean temEstoque() {
        if (quantidade > 0) {
            return true;
    } else {
            return false;
        }
    }

    void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }
    //vender(int quantidade), que diminui a quantidade em estoque apenas se houver produtos suficientes,
    // retornando true caso a venda seja realizada e false caso contrário.

    boolean vender(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        } else {
            return false;
        }
    }

}
