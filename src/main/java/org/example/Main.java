package org.example;


import org.example.Interface.MeioPagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<MeioPagamento> pagamentos = new ArrayList<>();

        Pix pix = new Pix(123321);
        Boleto boleto = new Boleto("Vinicius");
        CartaoCredito cartaoCredito = new CartaoCredito(567);

        pagamentos.add(pix);
        pagamentos.add(boleto);
        pagamentos.add(cartaoCredito);


        pix.pagar(100);
        cartaoCredito.pagar(100);
        boleto.pagar(100);



    }
}
