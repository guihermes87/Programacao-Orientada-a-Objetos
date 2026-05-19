public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void CalcularSalario() {
        System.out.println("Salário do funcionário: " + salario);
    }

    public void CalcularSalario(Desenvolvedor dev) {
        double salarioFinal = salario + (dev.getHorasextras() * 50); // Supondo que cada hora extra vale 50
        System.out.println("Salário do desenvolvedor: " + salarioFinal);
    }

    public void CalcularSalario(Gerente gerente) {
        double salarioFinal = salario + gerente.getBonus(); // Adiciona o bônus ao salário
        System.out.println("Salário do gerente: " + salarioFinal);
    }

}
