public class Animal {

    protected String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void andar() {
        System.out.println("O animal anda");
    }
}
