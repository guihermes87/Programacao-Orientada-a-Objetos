public class Gato implements Animal {


    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Informações do Gato:");
        
    }

    @Override
    public boolean verificarVacinacao() {
        System.out.println("Verificando vacinação do gato...");
        return false; // Supondo que o gato está vacinado
    }
}

