package Pessoas;

public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public void EfetuarCompra() {
        System.out.println("Pessoa Jurídica efetuando compra!");
    }

     public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
