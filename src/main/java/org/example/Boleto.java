package org.example;

import org.example.Interface.MeioPagamento;

public class Boleto implements MeioPagamento {

    private String nomeTitular;

    public Boleto(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void pagar(double valor){
        System.out.println("Gerando " + tipo() + " de R$" + valor + "...");
    }

    @Override
    public String tipo() {
        return "Boleto";
    }
}
