package com.algaworks.cartaobeneficio.agenda;

public class Principal {
    public static void main(String[] args) {
        Horario horario = new Horario(10,55);
        System.out.printf("%dh%dm", horario.hora, horario.minuto);
    }
}
