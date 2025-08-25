package com.algaworks.cartaobeneficio.matematica;

public class CalculadoraArea {

    public static final double PI = 3.14159265358979323846;

    private CalculadoraArea(){

    }

    public static double calcularAreaQuadrado(double mediaDoLado){
        return mediaDoLado * mediaDoLado;
    }

    public static double calcularAreaCirculo(double raio){
        return raio * raio * CalculadoraArea.PI;
    }
}
