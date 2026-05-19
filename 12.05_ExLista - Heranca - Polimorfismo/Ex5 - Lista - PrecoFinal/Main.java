public class Main {

    public static void main(String[] args) {
        
            Produto produto = new Produto(100);
            
            produto.CalcularPrecoFinal();
            
            Cliente cliente = new Cliente(20.0);
            
            produto.CalcularPrecoFinal(cliente);
    }

}
