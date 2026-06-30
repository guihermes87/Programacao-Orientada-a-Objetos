// - Crie uma classe chamada Filme com os atributos titulo, duracao (em minutos) e classificacaoEtaria. Crie um construtor que inicialize esses atributos. Implemente os métodos converterDuracaoHoras(), que retorna a duração do filme em horas, podeAssistir(int idade), que retorna true se a idade informada for maior ou igual à classificação etária,
// e descricaoFilme(), que retorna uma string com as informações do filme.

public class Filme {

    private String titulo;
    private int duracao; // em minutos
    private int classificacaoEtaria;

    public Filme(String titulo, int duracao, int classificacaoEtaria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public double converterDuracaoHoras() {
        return duracao / 60.0;
    }

    public boolean podeAssistir(int idade) {
        return idade >= classificacaoEtaria;
    }

    public String descricaoFilme() {
        return "Título: " + titulo + ", Duração: " + duracao + " minutos, Classificação Etária: " + classificacaoEtaria + "+";
    }
}
