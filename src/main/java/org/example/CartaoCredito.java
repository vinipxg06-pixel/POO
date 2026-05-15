package org.example;

import org.example.Interface.MeioPagamento;

public class CartaoCredito implements MeioPagamento {

    private int cvv;

    public CartaoCredito(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public void pagar(double valor){
        System.out.println("Pagando R$" + valor + " com " + tipo() + ".");
    }

    @Override
    public String tipo() {
        return "Cartão de Credito";
    }
}
