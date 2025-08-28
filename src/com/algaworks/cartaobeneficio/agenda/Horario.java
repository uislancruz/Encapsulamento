package com.algaworks.cartaobeneficio.agenda;

public record Horario (int hora, int minuto){

    public Horario{
        if(hora < 0 || hora > 23){
            throw new IllegalArgumentException("Hora invalida"+ hora);

        }
        if (minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Minuto invalido" + minuto);

        }

    }

    public String formatar(){
        return String.format("%d%h%dm", hora, minuto);
    }
}
