package org.example.Midia;

import com.sun.security.jgss.GSSUtil;
import org.example.Interface.Reproduzivel;

public class Musica extends Midia implements Reproduzivel {

    private String artista;

    public Musica(String artista, String titulo, int duracaoEmMinutos) {
        super(titulo,duracaoEmMinutos);
        this.artista = artista;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
    }

    @Override
    public double calcularCusto() {
        return 2;
    }

    @Override
    public void darPlay(){
        System.out.println("Você deu play na musica: " + this.titulo);
        System.out.println();
    }







}
