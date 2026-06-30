package pkg;

public class FuncionarioPJ extends Funcionario{
	
	public FuncionarioPJ (String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	@Override
	public String exibirDados() {
		return nome;
	}

	@Override
	public double calcularSalarioFinal() {
		return salarioBase;
	}

}
