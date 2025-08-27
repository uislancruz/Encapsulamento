package com.algaworks.cartaobeneficio.agenda;

public class CalcularHorario {

    private CalcularHorario() {
    }

    public static Horario somarDuasHoras(Horario horario){
        int hora = horario.getHora() + 2;

        if(hora > 24){
            hora = hora - 24;
        }
        horario.setHora(hora);

        return horario;
    }

}
