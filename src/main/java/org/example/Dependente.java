package org.example;

import java.time.LocalDate;

public class Dependente extends Beneficiario {


    public boolean conjuge;
    public Dependente(String cpf, String nome, LocalDate dataDeNascimento, boolean conjuge){
        super(cpf,nome,dataDeNascimento);
        this.conjuge = conjuge;
        this.mensalidadeBase = calcularMensalidade()-calcularMensalidade()*0.3;
    }


    public boolean getConjuge() {
        return conjuge;
    }

    public void setConjuge(boolean conjuge) {
        this.conjuge = conjuge;
    }
}
