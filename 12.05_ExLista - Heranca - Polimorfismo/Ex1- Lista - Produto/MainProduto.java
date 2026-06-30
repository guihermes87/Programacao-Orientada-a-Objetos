
import java.util.ArrayList;
import java.util.List;

public class MainProduto {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Notebook", 2500.00, 10);
        Produto produto2 = new Produto("Smartphone", 1500.00, 20);
        Produto produto3 = new Produto("Tablet", 1200.00, 15);

        List<Produto> listaProdutos = new ArrayList<Produto>();
        
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        
        exibirProdutos(listaProdutos);
}
    public static void exibirProdutos(List<Produto> lista) {
        for (Produto produto : lista) {
            System.out.println(produto);
        }
    }
}
