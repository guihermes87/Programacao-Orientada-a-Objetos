public class Principal {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5.0);
        System.out.println("Raio do círculo: " + circulo.getRaio());
        System.out.println("Área do círculo: " + circulo.calcularArea());


        Retangulo retangulo = new Retangulo(4.0, 6.0);
        System.out.println("Largura do retângulo: " + retangulo.getLargura());
        System.out.println("Altura do retângulo: " + retangulo.getAltura());
        retangulo.calcularArea();


        Carro carro = new Carro("Toyota", "Corolla", 2020);
        carro.exibeDetalhes();

        Triangulo triangulo = new Triangulo(3.0, 3.0, 3.0);
        System.out.println("Lado A do triângulo: " + triangulo.getLadoA());
        System.out.println("Lado B do triângulo: " + triangulo.getLadoB());
        System.out.println("Lado C do triângulo: " + triangulo.getLadoC());
        triangulo.verificaEquilatero();

        Pessoa pessoa = new Pessoa("João", 30, "0118102030");
        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Idade da pessoa: " + pessoa.getIdade());
        System.out.println("CPF da pessoa: " + pessoa.getCpf());
        pessoa.exibirInformacoes();
        pessoa.maiorIdade();

    }

}
