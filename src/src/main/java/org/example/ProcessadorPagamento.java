package org.example;

public class ProcessadorPagamento {

    CartaoCredito cartaoCredito;

    public ProcessadorPagamento(CartaoCredito cartaoCredito){
        this.cartaoCredito = cartaoCredito;
    }

    void executarVenda(double valor) {
        if (cartaoCredito.getLimiteDisponivel() >= valor) {
            cartaoCredito.setLimiteDisponivel(cartaoCredito.getLimiteDisponivel() - valor);
            System.out.printf("Venda Realizada!\nLimite: %.2f\n" , cartaoCredito.getLimiteDisponivel());
        } else {
            System.out.println("Transação Negada!");
        }
    }

    void estornarVenda(double valor){
        cartaoCredito.setLimiteDisponivel(valor+cartaoCredito.getLimiteDisponivel());
        System.out.printf("Valor estornado!\nLimite: %.2f\n" , cartaoCredito.getLimiteDisponivel());
    }



}
