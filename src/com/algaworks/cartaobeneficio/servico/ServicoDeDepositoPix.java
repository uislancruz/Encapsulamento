package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito){
        // TODO faz cobrança do valor no Pix

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw new IllegalArgumentException(
                    String.format("O valor de deposito não ser melhor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));

        }


        return new Recibo(cartao.titular, "deposito", valorDeposito);
    }

}
