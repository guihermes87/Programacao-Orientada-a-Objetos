public class Pessoa {
    
    protected  String nome;
    protected  int idade;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }


    
    
    
    

    public void exibeDados () {
        System.out.println("O nome da pessoa é " + this.nome);
        System.out.println("A idade da pessoa é " + this.idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

     
}
    

