package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public abstract class Beneficiario {
    private static String cpf;
    private String nome;
    protected LocalDate dataDeNascimento;
    double mensalidadeBase;

    public Beneficiario(String cpf, String nome, LocalDate dataDeNascimento){
        this.nome = nome;
        this.setCpf(cpf);
        this.dataDeNascimento = dataDeNascimento;
    }

    int idade = Period.between(dataDeNascimento, LocalDate.now()).getYears();

    public String getNome() {
        return nome;
    }
    public double calcularMensalidade(){
        if (idade<18){
            mensalidadeBase = 180;
        }
        if (idade>18 && idade<59){
            mensalidadeBase = 340;
        }
        if (idade>=60){
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
