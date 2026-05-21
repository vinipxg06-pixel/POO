package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public abstract class Beneficiario {
    private final String cpf;
    private String nome;
    protected LocalDate dataDeNascimento;
    protected double mensalidadeBase;

    public Beneficiario(String nome, String cpf, LocalDate dataDeNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade() {
        return Period.between(
                dataDeNascimento,
                LocalDate.now()
        ).getYears();
    }

    public String getNome() {
        return nome;
    }
    public double calcularMensalidade(){
        if (getIdade()<18){
            mensalidadeBase = 180;
        }
        if (getIdade()>18 && getIdade()<59){
            mensalidadeBase = 340;
        }
        if (getIdade()>=60){
            mensalidadeBase = 620;
        }
        return mensalidadeBase;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        dataDeNascimento = dataDeNascimento;
    }

    public double getMensalidadeBase() {
        return mensalidadeBase;
    }

    public void setMensalidadeBase(double mensalidadeBase) {
        this.mensalidadeBase = mensalidadeBase;
    }


    public abstract void mostrarResumo();


    public void solicitarCobertura(String tipo) {
        if (tipo.equals("INTERNACAO") && this instanceof Dependente) {
            System.out.println("Dependente "+ getNome() +",não pode marcar internação.");
            System.out.println();
        } else {
            System.out.println("--Consulta Marcada--");
            System.out.println("Data: " + LocalDate.now());
            System.out.println("Tipo: " + tipo);
            System.out.println("Beneficiário: " + getNome());
            System.out.println();
        }




    }
}
