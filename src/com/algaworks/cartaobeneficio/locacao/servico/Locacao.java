package com.algaworks.cartaobeneficio.locacao.servico;

public class Locacao {

    private Veiculo veiculo;
    private int quantidadeDiaria;

    public Locacao(){

    }

    public Locacao(Veiculo veiculo, int quantidadeDiaria){
        this.veiculo = veiculo;
        this.quantidadeDiaria = quantidadeDiaria;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getQuantidadeDiaria() {
        return quantidadeDiaria;
    }

    public void setQuantidadeDiaria(int quantidadeDiaria) {
        this.quantidadeDiaria = quantidadeDiaria;
    }
}
