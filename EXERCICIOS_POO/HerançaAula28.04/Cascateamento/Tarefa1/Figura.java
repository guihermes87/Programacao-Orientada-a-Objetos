public class Figura {

    private String cor;
    private boolean preenchida;
    
    
    public Figura(String cor, boolean preenchida) {
        this.cor = cor;
        this.preenchida = preenchida;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public boolean isPreenchida() {
        return preenchida;
    }


    public void setPreenchida(boolean preenchida) {
        this.preenchida = preenchida;
    }

    

}   