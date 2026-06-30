public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(int idade, String nome, Endereco endereco) {
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }


}
