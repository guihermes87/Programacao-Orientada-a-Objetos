public class Moto {

    public String marca;
    public String modelo;
    public int cilindradas;

    public void atribuirValores (String ma,String mo, int ci) {
        marca = ma;
        modelo = mo;
        cilindradas = ci;
    }

    public String retornaMarca() {
        return marca;
    }
    public String retornaModelo() {
        return modelo;
    }
    public int retornaCilindradas() {
        return cilindradas;
}
}
