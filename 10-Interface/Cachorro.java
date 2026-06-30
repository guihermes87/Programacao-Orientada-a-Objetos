public class Cachorro implements Animal {

    public String nome;
    public int idade;
    public String raca;

    


    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Informações do Cachorro:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Raça: " + raca);
}

    @Override
    public boolean verificarVacinacao() {
        System.out.println("Verificando vacinação do cachorro...");
        return true; // Supondo que o cachorro está vacinado
    }   
}