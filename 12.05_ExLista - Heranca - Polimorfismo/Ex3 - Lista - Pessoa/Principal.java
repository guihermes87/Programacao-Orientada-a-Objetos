import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        Pessoa pessoa1 = new Pessoa("João", 25, "Masculino");
        Pessoa pessoa2 = new Pessoa("Maria", 30, "Feminino");
        Pessoa pessoa3 = new Pessoa("Pedro", 20, "Masculino");

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        exibirPessoas(listaPessoas);

    }

    public static void exibirPessoas(List<Pessoa> lista2) {

        for (Pessoa pessoa : lista2) {

            if (pessoa.getSexo().equals("Feminino")) {
                
                System.out.println(
                        "Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Sexo: " + pessoa.getSexo());
            }

        }

    }
}
