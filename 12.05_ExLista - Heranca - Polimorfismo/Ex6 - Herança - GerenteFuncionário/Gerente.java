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

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void CalcularSalario(double bonus) {
        salarioFinal = getSalario() + getBonus(); // Adiciona o bônus ao salário
        System.out.println("Salário do gerente: " + salarioFinal);
    }

    @Override
    public String toString() {
        return "Gerente [Bonus =" + getBonus() + 
        ", Nome =" + getNome() + 
        ", Salario=" + getSalario() + 
        "salariofinal=" + salarioFinal + "]";
    }



    public double getSalarioFinal() {
        return salarioFinal;
    }



    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    
    

    
}
