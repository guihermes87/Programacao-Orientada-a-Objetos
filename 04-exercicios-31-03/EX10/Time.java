//Crie uma classe chamada Time com os atributos nome, golsMarcados e golsSofridos. Crie um construtor que
// inicialize os atributos. Implemente os métodos marcarGol(), que aumenta o número de gols marcados, sofrerGol(),
// que aumenta o número de gols sofridos, saldoGols(), que retorna a diferença entre gols marcados e sofridos,
// e resultadoPartida(), que retorna uma string
// indicando vitória, empate ou derrota com base no saldo de gols.

public class Time {

    private String nome;
    private int golsMarcados;
    private int golsSofridos;

    public Time(String nome) {
        this.nome = nome;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }

    public void marcarGol() {
        golsMarcados++;
    }

    public void sofrerGol() {
        golsSofridos++;
    }

    public int saldoGols() {
        return golsMarcados - golsSofridos;
    }

    public String resultadoPartida() {
        int saldo = saldoGols();
        if (saldo > 0) {
            return "Vitória";
        } else if (saldo < 0) {
            return "Derrota";
        } else {
            return "Empate";
        }
    }

}
