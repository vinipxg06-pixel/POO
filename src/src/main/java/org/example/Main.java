package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("------Sistema PayShield------");
        CartaoCredito cartaoCredito = new CartaoCredito("Vinicius", "123-321", 5000);
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento(cartaoCredito);
        processadorPagamento.executarVenda(2000);
        processadorPagamento.executarVenda(4000);

    }
}
