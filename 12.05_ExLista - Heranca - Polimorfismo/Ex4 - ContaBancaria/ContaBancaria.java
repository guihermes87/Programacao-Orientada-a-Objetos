public class ContaBancaria {

    private double valor;
    private double cheque;
    

    public ContaBancaria(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
            this.valor = valor;
    }

    public void depositar(double valor) {
        this.valor += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + this.valor);
        
    }


    public void depositar() {       
         
        valor = valor + cheque;
        System.out.println("Depósito de R$ " + cheque + " realizado com sucesso. Saldo atual: R$ " + this.valor);   
    }
}
