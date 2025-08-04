package com.algaworks.cartaobeneficio.dados;

public class Recibo {

    public String titular;
    public String descricao;
    public double valor;

    public Recibo(String titular, String descricao, double valor){
        this.titular = titular;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir(){
        System.out.println("---------------------------");
        System.out.printf("Recibo para %s%n",titular);
        System.out.printf("%s -> %.2f%n", descricao, valor);
        System.out.println("---------------------------");
    }

}
