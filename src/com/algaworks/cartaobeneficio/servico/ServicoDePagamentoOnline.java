package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.dados.Cartao;
import com.algaworks.cartaobeneficio.dados.Estabelecimento;
import com.algaworks.cartaobeneficio.dados.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){


        cartao.debitar(valor);

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
