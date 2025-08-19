package com.algaworks.cartaobeneficio.locacao.servico;

public class ServicoDeLocacao {

    public void confirmarLocacao(Locacao locacao){

        double totalDiaria = locacao.calcularTotalDiarias();

        locacao.reservarVeiculo();


    }
}
