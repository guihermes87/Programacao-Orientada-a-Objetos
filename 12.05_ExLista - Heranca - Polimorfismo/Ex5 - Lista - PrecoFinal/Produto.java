public class Produto{
    
    private double preco;

    public Produto(double preco) {
        
        this.preco = preco;
    }

    
    public double getPreco() {
        return preco;
    }

    public void CalcularPrecoFinal() {
        
        double precoFinal = preco;
        System.out.println("Preço final do produto: " + precoFinal);
    }

    

        public void CalcularPrecoFinal(Cliente cliente) {
            
            double precoFinal = preco - cliente.getDesconto();
            System.out.println("Preço final do produto com desconto do cliente: " + precoFinal);
        }
}
