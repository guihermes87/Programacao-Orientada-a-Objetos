public class Principal {
    public static void main(String[] args) {
        Animal a = new Animal();

        a.fazerSom();

        Cachorro c = new Cachorro();

        c.fazerSom();

        a = new Cachorro();
        a.fazerSom();

        a = new Passarinho();
        a.fazerSom();

        a = new Peixe();
        a.fazerSom();
    }
}
