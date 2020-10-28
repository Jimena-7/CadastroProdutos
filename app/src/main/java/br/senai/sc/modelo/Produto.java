package br.senai.sc.modelo;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Produto implements Serializable {
    private int id;
    private String Nome;
    private float Valor;


    public Produto(int id, String nome, float valor) {
        this.id = id;
        this.Nome = nome;
        this.Valor = valor;
    }

    public Produto(String nome, float valor) {
        Nome = nome;
        Valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
