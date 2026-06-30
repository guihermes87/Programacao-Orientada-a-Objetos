package AcDados;

public class Principal {

        public static void main(String[] args) {
            
            BancoDeDados bancoDeDados = new BancoDeDados();

            bancoDeDados.Conectar();
            bancoDeDados.inserir();
            bancoDeDados.atualizar();
            bancoDeDados.excluir();
            bancoDeDados.Desconectar();
        }
}
