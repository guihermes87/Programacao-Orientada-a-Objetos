public class Pessoa {
    
    private String nome;

    public Pessoa (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
        public void setNome(String nome) {
            this.nome = nome;
        }
    
    public void trabalhar() {
        System.out.println(this.nome + " está trabalhando.");
    }

}