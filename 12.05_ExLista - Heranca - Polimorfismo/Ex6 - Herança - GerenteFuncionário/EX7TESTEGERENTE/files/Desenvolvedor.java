public class Desenvolvedor extends Funcionario {

    private int horasExtras;

    public Desenvolvedor(String nome, double salario, int horasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
    }

    public int  getHorasExtras()          { return horasExtras; }
    public void setHorasExtras(int h)     { this.horasExtras = h; }

    // SOBRESCRITA — salario final do Desenvolvedor inclui horas extras
    @Override
    public double calcularSalarioFinal() {
        return getSalario() + (horasExtras * 50.0);
    }

    @Override
    public String toString() {
        return "Desenvolvedor [nome=" + getNome()
             + ", salario=" + getSalario()
             + ", horasExtras=" + horasExtras
             + ", salarioFinal=" + String.format("%.2f", calcularSalarioFinal()) + "]";
    }
}
