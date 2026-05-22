package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Titular extends Beneficiario {

    ArrayList<Dependente> dependente = new ArrayList<>();
    boolean aposentado = false;

    public Titular(String nome, String cpf, LocalDate dataDeNascimento, boolean aposentado) {
        super(nome, cpf, dataDeNascimento);
        this.aposentado = aposentado;
        if (aposentado) {
            setMensalidadeBase(calcularMensalidade() - calcularMensalidade() * 0.20);
        }
    }

    @Override
    public void mostrarResumo() {
        double totalMensal = 0;
        System.out.println("Titular:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Nascimento: " + dataDeNascimento);
        System.out.println("Aposentado: " + aposentado);
        totalMensal += this.getMensalidadeBase();
        for (int i = 0; i < dependente.size(); i++) {
            System.out.println("\nDependente " + (i + 1) + ":");
            dependente.get(i).mostrarResumo();
            totalMensal += dependente.get(i).getMensalidadeBase();
        }
        System.out.printf("Valor mensal total do grupo: %.2f\n", totalMensal);
    }

    public void adicionarDependente(Dependente NovoDependente) {
        if (this.dependente.size() >= 3) {
            System.out.println("Não foi possivel adicionar dependente " + NovoDependente.getNome() + ". Você já inseriu o limite de dependente!");
        } else if (NovoDependente.getIdade() > 24) {
            System.out.println("Não foi possivel adicionar dependente " + NovoDependente.getNome() + ". O dependente deve ser menor de 24 anos");
        } else {
            System.out.println("Dependente adicionado: " + NovoDependente.getNome());
            this.dependente.add(NovoDependente);
        }
    }

    @Override
    public void solicitarCobertura(String tipo) {
        super.solicitarCobertura(tipo);
    }

    public ArrayList<Dependente> getDependente() {
        return dependente;
    }

    public void setDependente(ArrayList<Dependente> dependente) {
        this.dependente = dependente;
    }

    public boolean getAposentado() {
        return aposentado;
    }

    public void setAposentado(boolean aposentado) {
        this.aposentado = aposentado;
    }
}
