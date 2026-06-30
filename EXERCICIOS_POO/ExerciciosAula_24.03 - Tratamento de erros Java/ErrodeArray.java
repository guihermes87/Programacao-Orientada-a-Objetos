public class ErrodeArray {

    public static void main(String[] args) {

        try {
            String[] nomes = {"Ana", "José", "João", "Maria", "Pedro"};
            System.out.println(nomes[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora do Array" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
