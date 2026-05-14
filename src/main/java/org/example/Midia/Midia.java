package org.example.Midia;

 abstract class Midia {

    protected String titulo;
    protected int duracaoEmMinutos;

    public Midia(String titulo, int duracaoEmMinutos){
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    void exibirDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Duração em minutos: " + this.duracaoEmMinutos);
        System.out.println();
    }

    abstract double calcularCusto();

     public int getDuracaoEmMinutos() {
         return duracaoEmMinutos;
     }
 }
