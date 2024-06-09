package com.alura.screenmatch.calculos;

public class FiltroDeRecomendacion {

    public void filtra(Calificacion calificacion) {

        if (calificacion.getCalificacion() >= 4) {
            System.out.println("Muy bien evaluado hasta ahora");
        } else if (calificacion.getCalificacion() >= 2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Colocalo en tu lista para verlo mas tarde");
        }

    }
}
