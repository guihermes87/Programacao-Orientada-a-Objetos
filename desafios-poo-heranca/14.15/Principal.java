public class Principal {

    public static void main(String[] args) {
        try {
            Data data = new Data(20, 2, 2024);
            data.validarData();
            System.out.println("Data válida: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
