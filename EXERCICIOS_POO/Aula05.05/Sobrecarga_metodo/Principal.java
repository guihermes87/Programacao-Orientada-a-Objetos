


public class Principal {
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        int resultado1 = c.somar(10, 20);
        int resultado2 = c.somar(10, 20, 30);
        double resultado3 = c.somar(10, 20);

        System.out.println("Resultado da soma de 10 e 20: " + resultado1);
        System.out.println("Resultado da soma de 10, 20 e 30: " + resultado2);
        System.out.println("Resultado da soma de 10 e 20: " + resultado3);

        resultado2 = c.multiplicar(10, 20);
        resultado3 = c.multiplicar(10.2, 20.2);

        System.out.println("Resultado da multiplicação de 10 e 20: " + resultado2);
        System.out.println("Resultado da multiplicação de 10.2 e 20.2: " + resultado3);
    

    Pessoa p = new Pessoa();
    p.dizerOla();

    p = new Pessoa("João");
    p.dizerOla("João");
}
}
