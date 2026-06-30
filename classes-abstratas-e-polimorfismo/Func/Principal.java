package Func;

public class Principal {

    public static void main(String[] args) {
        
        Gerente gerente = new Gerente();
        gerente.CalcularSalario();

        Vendedor vendedor = new Vendedor();
        vendedor.CalcularSalario();
    }

}
