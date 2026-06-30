public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome   = nome;
        this.salario = salario;
    }

    public String getNome()              { return nome; }
    public void   setNome(String nome)   { this.nome = nome; }
    public double getSalario()           { return salario; }
    public void   setSalario(double s)   { this.salario = s; }

    // Calculo base — sem extra
    public double calcularSalarioFinal() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome
             + ", salario=" + salario
             + ", salarioFinal=" + String.format("%.2f", calcularSalarioFinal()) + "]";
    }
}
