public class Principal {

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rex";
        cachorro.idade = 5;
        cachorro.raca = "Labrador";

        cachorro.emitirSom();
        cachorro.exibirInfo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.exibirInfo();
        
        System.out.println("Vacinação do cachorro: " + (cachorro.verificarVacinacao() ? "Vacinado" : "Não vacinado"));
        System.out.println("Vacinação do gato: " + (gato.verificarVacinacao() ? "Vacinado" : "Não vacinado"));


        Smartphone smartphone = new Smartphone("123-456-7890", "guilhermepqs@hotmail.com");
        smartphone.realizarChamada();
        smartphone.verificarEmail();
        
    }
}
