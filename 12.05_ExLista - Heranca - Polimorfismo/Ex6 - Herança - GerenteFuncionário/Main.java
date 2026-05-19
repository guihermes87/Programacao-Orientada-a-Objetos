public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 3000);
        Desenvolvedor desenvolvedor = new Desenvolvedor(10); // 10 horas extras
        Gerente gerente = new Gerente(500); // Bônus de 500

        funcionario.CalcularSalario(); // Salário do funcionário: 3000.0
        funcionario.CalcularSalario(desenvolvedor); // Salário do desenvolvedor: 3500.0
        funcionario.CalcularSalario(gerente); // Salário do gerente: 3500.0
    }

}
