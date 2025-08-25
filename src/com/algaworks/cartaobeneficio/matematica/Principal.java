package com.algaworks.cartaobeneficio.matematica;

public class Principal {

    public static void main(String[] args) {

        double areaQuadrado = CalculadoraArea.calcularAreaQuadrado(5.2);
        double areaCirculo = CalculadoraArea.calcularAreaCirculo(10.5);

        System.out.printf("PI: %.2f%n", CalculadoraArea.PI);
        System.out.printf("Area do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Area do circulo: %.2f%n", areaCirculo);

    }
}
