package com.algaworks.cartaobeneficio.agenda;

public class Horario {

    public int hora;
    public int minuto;

    public Horario(int hora, int minuto){
        if (hora < 0 || hora > 23){
            throw new IllegalArgumentException("Hora inválida" + hora);
        }

        if (minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Minuto inválido" + minuto);
        }

        this.hora = hora;
        this.minuto = minuto;
    }

}
