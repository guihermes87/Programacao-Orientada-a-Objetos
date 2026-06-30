public class Principal {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa(27, "Guilherme", new Endereco("Rua A", 123));

        exibirDadosPessoa(p);



    }

    public static void exibirDadosPessoa(Pessoa pe) {
            System.out.println("No métodos estático exibeDadosPessoa");
            System.out.println("Nome"+ pe.getNome());
            System.out.println("Idade:" +pe.getIdade());
        }
}
