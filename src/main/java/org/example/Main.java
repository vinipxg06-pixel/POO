package org.example;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        Titular titular = new Titular("Vinicius", "111.111.", LocalDate.of(2008, 11, 06), false);
        Titular titularAposentado = new Titular("Ruan", "222.222", LocalDate.of(2000, 10, 05), true);

        Dependente dependente = new Dependente("Pablo", "333.333", LocalDate.of(2015, 01, 01), true);
        Dependente dependente2 = new Dependente("Luiz", "444.444", LocalDate.of(2010, 05, 05), false);
        Dependente dependente3 = new Dependente("Kaio", "555.555", LocalDate.of(2020, 02, 03), false);
        Dependente dependente4 = new Dependente("Henrique", "666.666", LocalDate.of(2021, 04, 9), false);
        Dependente dependente5 = new Dependente("Julio", "777.777", LocalDate.of(1993, 04, 9), false);


        titular.adicionarDependente(dependente);
        titular.adicionarDependente(dependente2);
        titular.adicionarDependente(dependente3);
        titular.adicionarDependente(dependente4);
        System.out.println();
        titularAposentado.adicionarDependente(dependente);
        titularAposentado.adicionarDependente(dependente2);
        titularAposentado.adicionarDependente(dependente5);
        titular.calcularMensalidade();
        titularAposentado.calcularMensalidade();
        System.out.println();
        dependente2.calcularMensalidade();
        dependente.calcularMensalidade();
        System.out.println();
        titular.solicitarCobertura("INTERNACAO");
        titular.solicitarCobertura("EXAME");
        titular.solicitarCobertura("CONSULTA");
        System.out.println();
        titularAposentado.solicitarCobertura("INTERNACAO");
        titularAposentado.solicitarCobertura("EXAME");
        titularAposentado.solicitarCobertura("CONSULTA");
        System.out.println();
        dependente.solicitarCobertura("INTERNACAO");
        dependente.solicitarCobertura("EXAME");
        dependente.solicitarCobertura("CONSULTA");
        System.out.println("\n====Resumo titular====\n");
        titular.mostrarResumo();
        System.out.println("\n====Resumo titular aposentado====\n");
        titularAposentado.mostrarResumo();
        System.out.println("\n====Resumo dependente====\n");
        dependente.mostrarResumo();


    }
}
