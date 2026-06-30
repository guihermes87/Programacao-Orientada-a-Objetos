public class Principal {

    public static void main(String[] args) {
        
        Produto produto1 =  new Produto("Camiseta", 29.99, 20);

        produto1.calculaValorEstoque();

        System.out.println(produto1.nome +  "Tem estoque? " + produto1.temEstoque());
        
        produto1.adicionarEstoque(5);
        
        System.out.println("Quantidade após adicionar estoque: " + produto1.quantidade);

        boolean vendaRealizada = produto1.vender(3);
        
        System.out.println("Venda realizada? " + vendaRealizada);
        
        System.out.println("Quantidade após venda: " + produto1.quantidade);

        


        


    }
}
