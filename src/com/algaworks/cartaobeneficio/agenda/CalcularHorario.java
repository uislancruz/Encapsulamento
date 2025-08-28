package com.algaworks.cartaobeneficio.agenda;

public class CalcularHorario {

    private CalcularHorario() {
    }

    public static Horario somarDuasHoras(Horario horario){
        int hora = horario.hora() + 2;

        if(hora > 24){
            hora = hora - 24;
        }

//        horario.setHora(hora);
//        return horario;

        return new Horario(hora, horario.minuto());
    }

}
