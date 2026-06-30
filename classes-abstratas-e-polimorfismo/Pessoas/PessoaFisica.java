package Pessoas;

public class PessoaFisica extends Pessoa {

    private String cpf;

    
    public void EfetuarCompra() {
        System.out.println("Pessoa Física efetuando compra!");
    }

     public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
