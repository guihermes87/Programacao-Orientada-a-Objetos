package org.yourcompany.yourproject;
import java.io.Serializable;

class Produto implements Serializable {
    private String nome;
    private double preco;
    private String codigo;
    private transient String temporario;
    
    
    public Produto(String nome, double preco, String codigo, String temporario) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.temporario = temporario;
    }


    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public String getCodigo() {
        return codigo;
    }


    public String getTemporario() {
        return temporario;
    }


    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", codigo=" + codigo + "]";
    }


}
