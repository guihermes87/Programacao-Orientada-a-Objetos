public class Funcionario {

    public String nome;
    public double salario;
    public int horasExtras = 50;
    public double horasTrabalhadas;
    public double ValorHoraExtra;
    public int horas;

    public Funcionario(int horasExtras, String nome, double salario) {
        this.horasExtras = horasExtras;
        this.nome = nome;
        this.salario = salario;
    }

    void calcularValorHoraExtra() {

        ValorHoraExtra = horasExtras * horasTrabalhadas;
        System.out.println(ValorHoraExtra);
    }

    void calcularPagamentoTotal() {

        salario += ValorHoraExtra;
        System.out.println(salario);
    }

    void adicionarhorasExtras( double horasExtras) {
        
        salario += horasExtras * ValorHoraExtra;
        System.out.println(salario);
        
    }



}
