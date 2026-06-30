public class Desenvolvedor extends Funcionario {

    private int horasextras;
    private double salarioFinal;

    public Desenvolvedor(String nome, double salario, int horasextras) {
        super(nome, salario);
        this.horasextras = horasextras;

    }

    public int getHorasextras() {
        return horasextras;
    }

    public void setHorasextras(int horasextras) {
        this.horasextras = horasextras;
    }

    public void CalcularSalario(int horasextras) {
        salarioFinal = getSalario() + (getHorasextras() * 50); // Supondo que cada hora extra vale 50
        System.out.println("Salário do desenvolvedor: " + salarioFinal);
    }

    @Override
    public String toString() {
        return "Desenvolvedor [horasextras=" + horasextras + ", salario=" + getSalario() + ", salarioFinal=" + salarioFinal
                + ", getNome()=" + getNome() + "]";
    }
    

}


