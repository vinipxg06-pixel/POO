package org.example;

public class CartaoCredito {
    private String titular, numeroCartao, cvv;
    private double limiteDisponivel;

    public CartaoCredito(String titular, String numeroCartao, double limiteDisponivel) {
        this.titular = titular;
        this.numeroCartao = numeroCartao;
        this.limiteDisponivel = limiteDisponivel;
    }

    void alterarLimite(double valor) {
        if (valor >= 0) {
            this.limiteDisponivel = valor;
            System.out.printf("Valor alterado!\nLimite: %.2f\n" , getLimiteDisponivel());
        } else {
            System.out.println("Valor negativo!Não pode!");
        }
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

}
