package org.example;

import org.example.Interface.Baixavel;
import org.example.Interface.Reproduzivel;
import org.example.Midia.Filme;
import org.example.Midia.Musica;
import org.example.Utilitarios.ConversorTempo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Filme filme = new Filme("4K", "Todo mundo em panico 6", 93);
        Musica musica = new Musica("CPM22", "Um minuto para o fim do mundo", 4);

        filme.exibirDetalhes();
        musica.exibirDetalhes();

        filme.calcularCusto();
        musica.calcularCusto();

        processarPlayer(filme);
        processarPlayer(musica);

        filme.realizarDowload();

        ConversorTempo.formatarMinutos(filme.getDuracaoEmMinutos());
        ConversorTempo.formatarMinutos(musica.getDuracaoEmMinutos());



    }

    public static void processarPlayer(Reproduzivel item) {
        item.darPlay();
    }
}
