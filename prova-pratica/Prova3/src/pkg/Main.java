package pkg;

public class Main {

	public static void main(String[] args) {
	
		FuncionarioCLT f1 = new FuncionarioCLT("Pedro", 4500);
		System.out.println("Nome: " +f1.getNome());
		System.out.println("Salário: " +f1.getSalarioBase());
		
		FuncionarioPJ f2 = new FuncionarioPJ("Andreia", 4000);
		System.out.println("Nome: " +f2.getNome());
		System.out.println("Salário: " +f2.getSalarioBase());
		
	}

}
