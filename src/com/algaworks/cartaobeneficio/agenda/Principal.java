package com.algaworks.cartaobeneficio.agenda;

public class Principal {
    public static void main(String[] args) {
        Horario horario = new Horario(10,30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");
        Agendamento agendamentoBarba = new Agendamento(horario, "Corte Barba");

        horario.setHora(11);
        horario.setMinuto(45);

        imprimir

        System.out.println(horario.formatar());
    }

    private static void
}
