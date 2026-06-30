public class Gerente extends Funcionario {

    private double bonus;
    private double salarioFinal;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double b) {
        this.bonus = b;
    }

    // SOBRESCRITA — calcula salario final com bonus, sem precisar chamar metodo
    // separado
    @Override
    public double calcularSalarioFinal() {
        salarioFinal = getSalario() + bonus;
        return salarioFinal;
    }


    @Override
    public String toString() {
        return "Gerente [Bonus=" + getBonus()
                + ", Nome=" + getNome()
                + ", Salario=" + getSalario()
                + ", salarioFinal=" + String.format("%.2f", calcularSalarioFinal()) + "]";
    }
}
