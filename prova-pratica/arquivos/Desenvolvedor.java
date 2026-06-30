public class Desenvolvedor extends Funcionario {

    private int    horasextras;
    private double salarioFinal;

    public Desenvolvedor(String nome, double salario, int horasextras) {
        super(nome, salario);
        this.horasextras = horasextras;
    }

    public int  getHorasextras()       { return horasextras; }
    public void setHorasextras(int h)  { this.horasextras = h; }

    // SOBRESCRITA — calcula salario final com horas extras, sem precisar chamar metodo separado
    @Override
    public double calcularSalarioFinal() {
        salarioFinal = getSalario() + (horasextras * 50);
        return salarioFinal;
    }

    public void CalcularSalario(int horasextras) {
        System.out.println("Salário do desenvolvedor: " + calcularSalarioFinal());
    }

    @Override
    public String toString() {
        return "Desenvolvedor [horasextras=" + horasextras
             + ", salario=" + getSalario()
             + ", salarioFinal=" + String.format("%.2f", calcularSalarioFinal())
             + ", getNome()=" + getNome() + "]";
    }
}
