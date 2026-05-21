package org.example;

import java.time.LocalDate;

public class Dependente extends Beneficiario {


    public boolean conjuge;

    public Dependente(String nome, String cpf, LocalDate dataDeNascimento, boolean conjuge) {
        super(nome, cpf, dataDeNascimento);
        this.conjuge = conjuge;
        this.mensalidadeBase = calcularMensalidade() - calcularMensalidade() * 0.3;
    }

    public void setConjuge(boolean conjuge) {
        this.conjuge = conjuge;
    }

    @Override
    public double getMensalidadeBase() {
        return mensalidadeBase;
    }

    @Override
    public void solicitarCobertura(String tipo) {
        super.solicitarCobertura(tipo);
    }

    @Override
    public void mostrarResumo() {
        double totalMensal = 0;
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Nascimento: " + dataDeNascimento);

    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    public boolean getConjuge() {
        return conjuge;
    }
}
