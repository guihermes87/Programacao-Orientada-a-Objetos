package pkg;

public class FuncionarioCLT extends Funcionario {

	public FuncionarioCLT(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	@Override
	public String exibirDados() {
		return nome;
		
	}
	
	public double getSalarioBase() {
		return salarioBase + 500;
	}

	@Override
	public double calcularSalarioFinal() {
		return salarioBase;
	}
}
