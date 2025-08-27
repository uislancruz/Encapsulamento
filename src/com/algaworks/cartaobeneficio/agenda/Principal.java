package com.algaworks.cartaobeneficio.agenda;

public class Principal {
    public static void main(String[] args) {
        Horario horario = new Horario(10,30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");


        Agendamento agendamentoBarba = new Agendamento(horario, "Corte Barba");

        Horario novoHorario = CalcularHorario.somarDuasHoras(horario);

        imprimir(agendamentoCabelo);
        imprimir(agendamentoBarba);

        System.out.println(novoHorario.formatar());
    }

    private static void imprimir (Agendamento agendamento){
        System.out.printf("%s às %s%n", agendamento.getDescricao(), agendamento.getHorario().formatar());
    }
}
