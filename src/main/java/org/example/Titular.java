package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Titular extends Beneficiario {

    ArrayList<Dependente> dependente = new ArrayList<>();
    boolean aposentado = false;
    public Titular(String nome, String cpf, LocalDate dataDeNascimento, boolean aposentado) {
        super(nome, cpf, dataDeNascimento);
        this.aposentado = aposentado;
        if (aposentado){
            setMensalidadeBase(calcularMensalidade()-calcularMensalidade()*0.20);
        }
    }
    public void mostrarResumo(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Nascimento: " + dataDeNascimento);
        System.out.println("Aposentado: " + aposentado);
        for (int i = 0; i<3; i++){
            if (dependente.get(i)!=null){
                System.out.println("Nome: " + getNome());
                System.out.println("CPF: " + getCpf());
                System.out.println("Nascimento: " + dataDeNascimento);
                System.out.println("Conjuge: " + );

            }
        }

    }



    public void adicionarDependente(Dependente NovoDependente) {
        if (this.dependente.size() >= 3) {
            System.out.println("Você já inseriu o limite de dependente!");
        }
        if (idade>24){
            System.out.println("O dependente deve ser menor de 24 anos");
        }
    this.dependente.add(NovoDependente);
    }



}
