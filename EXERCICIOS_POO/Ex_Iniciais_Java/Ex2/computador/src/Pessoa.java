public class Pessoa {

    public String nome;
    public int idade;
    public String genero;

    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        
    }
    public void exibirDadosPessoa() {
        System.out.println("Nome: " + nome + " | Modelo: " + idade + 
                           " | Tipo: " + genero);
    }
}


