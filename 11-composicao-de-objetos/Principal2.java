public class Principal2 {

    public static void main(String[] args) {
        
        Produto p1 = new Produto("Caneta", 2.50);
        //Produto p2 = p1.clone();
        Produto p2 = p1.aponta();

        p2.setPreco(3.00);


        System.out.println("Produto 1: " + p1.getNome() + " - R$" + p1.getPreco());
        System.out.println("Produto 2: " + p2.getNome() + " - R$" + p2.getPreco());

        
    }
        
}
