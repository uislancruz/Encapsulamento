package com.algaworks.cartaobeneficio.financeiro;

import java.io.Serializable;

public class Fornecedor implements Serializable {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome = "";

    public Fornecedor(){

    }

    public Fornecedor(String nome){
        this.nome = nome;
    }
}
