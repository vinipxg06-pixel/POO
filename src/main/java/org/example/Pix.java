package org.example;

import org.example.Interface.MeioPagamento;

public class Pix implements MeioPagamento {

    private int chave;

    public Pix(int chave) {
        this.chave = chave;
    }

    @Override
    public void pagar(double valor){
        System.out.println("Pagando R$" + valor + " via " + tipo() + "Chave: ");
    }

    @Override
    public String tipo() {
        return "Pix";
    }
}
