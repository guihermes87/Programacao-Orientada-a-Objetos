public class Principal {

    public static void main(String[] args) {
        
        AcessoDados acessoDados = new BancoDeDados();

        acessoDados.conectar();
        acessoDados.inserir();
        acessoDados.atualizar();
        acessoDados.excluir();
        acessoDados.desconectar();
    }

}
