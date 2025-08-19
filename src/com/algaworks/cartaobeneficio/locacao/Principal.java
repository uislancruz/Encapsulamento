package com.algaworks.cartaobeneficio.locacao;


import com.algaworks.cartaobeneficio.locacao.servico.GrupoVeiculo;
import com.algaworks.cartaobeneficio.locacao.servico.Locacao;
import com.algaworks.cartaobeneficio.locacao.servico.ServicoDeLocacao;
import com.algaworks.cartaobeneficio.locacao.servico.Veiculo;

public class Principal {

    public static void main(String[] args) {
        GrupoVeiculo grupo = new GrupoVeiculo("SUV", 450);
        Veiculo veiculo = new Veiculo("ALG-9999", grupo);
        Locacao locacao = new Locacao(veiculo, 5);

        ServicoDeLocacao servicoDeLocacao = new ServicoDeLocacao();
        servicoDeLocacao.confirmarLocacao(locacao);
    }

}