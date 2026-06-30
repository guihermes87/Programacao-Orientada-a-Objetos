


public class PrincipalEndereco {
    public static void main(String[] args) {
        
        // Endereco endereco = new Endereco("Rua A", 123);
        // Pessoa p1 = new Pessoa(27, "Guilherme", endereco);

        Pessoa p1 = new Pessoa(27, "Guilherme", new Endereco("Rua A", 123));

        System.out.println("Pessoa: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println(p1.getEndereco());
        System.out.println("Endereço: " + p1.getEndereco().getRua() + ", " + p1.getEndereco().getNumero());




    }
}
