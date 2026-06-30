public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void validarData() {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido: " + dia);
        }
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        }
        if (ano < 0) {
            throw new IllegalArgumentException("Ano inválido: " + ano);
        }

        if (this.dia == 30 && (mes ==2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            throw new IllegalArgumentException("Mês " + mes + " não tem 30 dias.");
        }
    }
}   


