public class PessoaJuridica extends Pessoa {

    protected  String cnpj;
    protected  String socio;
    protected  String dtAbertura;




     public PessoaJuridica(int idade, String nome, String cnpj, String socio, String dtAbertura) {
        super(idade, nome);
        this.cnpj = cnpj;
        this.socio = socio;
        this.dtAbertura = dtAbertura;
    }

    public PessoaJuridica(int idade, String nome) {
        super(idade, nome);
    }


     @Override
     public void exibeDados () {
         super.exibeDados();
            System.out.println("O CNPJ da pessoa jurídica é " + this.cnpj);
            System.out.println("O sócio da pessoa jurídica é " + this.socio);
            System.out.println("A data de abertura da pessoa jurídica é " + this.dtAbertura);
     }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public String getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(String dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

}
