

public class Principal {

    public static void main(String[] args) {
        Filme filme1 = new Filme("O Senhor dos Anéis", 180, 12);
        System.out.println(filme1.descricaoFilme());
        System.out.println("Duração em horas: " + filme1.converterDuracaoHoras());
        System.out.println("Pode assistir com 10 anos? " + filme1.podeAssistir(10));
        System.out.println("Pode assistir com 15 anos? " + filme1.podeAssistir(15));
    }

}
