package Model;

import java.io.Serializable;

public class Resultado implements Serializable{

    private float resultado;

    public Resultado(float resultado) {
        this.resultado = resultado;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
}
