public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome.isBlank()|| nome.isEmpty()) {
            System.err.println("O nome não pode ser vazio ou em branco.");

        } else {
        this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if (idade < 18) {
            System.out.println("A idade deve ser maior de 18 anos.");
            } else {
            this.idade = idade;
        }
    }


}
