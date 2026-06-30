public class Smartphone implements Celular, PC {

    String tel;
    String email;

    

    public Smartphone(String tel, String email) {
        this.tel = tel;
        this.email = email;
    }

    @Override
    public void realizarChamada() {
        System.out.println("Realizando uma chamada...");
    }

    @Override
    public void verificarEmail() {
        System.out.println("Verificando e-mails...");
    }

}
