package br.senai.sc.modelo;

import androidx.annotation.NonNull;

public class Produto {
    private String Nome;
    private float Valor;

    public Produto(String nome, float valor) {
        Nome = nome;
        Valor = valor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float valor) {
        Valor = valor;
    }


    @Override
    public String toString() {
        return Nome + " - " + Valor ;
    }
}
