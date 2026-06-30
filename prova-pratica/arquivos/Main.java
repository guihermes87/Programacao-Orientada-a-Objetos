import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario("Joao", 3000));
        lista.add(new Desenvolvedor("Maria", 30000, 50));
        lista.add(new Gerente("Carlos", 5000, 1000));

        for (Funcionario f : lista) {
            System.out.println(f.toString());
        }
    }
}
