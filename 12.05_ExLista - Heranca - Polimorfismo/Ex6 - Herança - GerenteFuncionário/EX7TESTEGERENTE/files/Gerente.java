public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus()           { return bonus; }
    public void   setBonus(double b)   { this.bonus = b; }

    // SOBRESCRITA — salario final do Gerente inclui bonus
    @Override
    public double calcularSalarioFinal() {
        return getSalario() + bonus;
    }

    @Override
    public String toString() {
        return "Gerente [nome=" + getNome()
             + ", salario=" + getSalario()
             + ", bonus=" + bonus
             + ", salarioFinal=" + String.format("%.2f", calcularSalarioFinal()) + "]";
    }
}
