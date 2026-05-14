package org.example.Midia;

import org.example.Interface.Baixavel;
import org.example.Interface.Reproduzivel;

public class Filme extends Midia implements Reproduzivel, Baixavel {

    private String qualidade;

    public Filme(String qualidade, String titulo, int duracaoEmMinutos){
        super(titulo,duracaoEmMinutos);
        this.qualidade = qualidade;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
    }

    @Override
    public double calcularCusto(){
        if (qualidade.equalsIgnoreCase("4K")){
            return 15;
        } else {
            return 10;
        }
    }

    @Override
    public void darPlay() {
        System.out.println("Você deu play em: " + this.titulo);
        System.out.println();
    }

    @Override
    public void realizarDowload(){
        System.out.println("Baixando: " + this.titulo);
        System.out.println();
    }


}
