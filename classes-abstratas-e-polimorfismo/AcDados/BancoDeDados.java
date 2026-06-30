package AcDados;

public class BancoDeDados implements AcessoDados {

    @Override
    public void Conectar() {
        System.out.println("Conectando ao banco de dados...");
    }

    @Override
    public void Desconectar() {
        System.out.println("Desconectando do banco de dados...");
    }

    @Override
    public void inserir() {
        System.out.println("Inserindo dados no banco de dados...");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando dados no banco de dados...");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo dados do banco de dados...");
    }

}
