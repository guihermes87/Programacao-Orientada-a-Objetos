public class Principal {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João");
        Funcionario funcionario = new Funcionario("Maria", "Engenheira");

        pessoa.trabalhar(); // Saída: João está trabalhando.
        funcionario.trabalhar(); // Saída: Maria está trabalhando como Engenheira.
    }
}
