public class Gerente extends Funcionario {

    private double bonus;
   
    public Gerente(double salario, double bonus) {
        super(salario);
        this.bonus = bonus;
    }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

    public double calcularSalario(double salario) {

        double salarioBase = super.calcularSalario(); // Chama o método da classe base para obter o salário base
        return salarioBase * bonus; // Gerente recebe 20% a mais
    }

}
