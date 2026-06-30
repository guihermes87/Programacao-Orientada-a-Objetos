public class Pessoa {
    
    public String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }



    public void dizerOla(){
        System.out.println("Olá, tudo bem?");
    }

    public void dizerOla(String nome){
        System.out.println("Olá " + nome + ", tudo bem?");
    }
}
