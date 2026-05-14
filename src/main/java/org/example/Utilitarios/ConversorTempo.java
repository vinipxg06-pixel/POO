package org.example.Utilitarios;

public class ConversorTempo {

    public static void formatarMinutos(int minutos){
        System.out.println("Tempo: " + minutos/60 + "h " + minutos%60 + "min");
    }

}
