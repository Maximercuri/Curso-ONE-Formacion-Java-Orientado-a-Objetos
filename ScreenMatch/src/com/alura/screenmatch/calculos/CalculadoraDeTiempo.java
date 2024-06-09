package com.alura.screenmatch.calculos;

import com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public CalculadoraDeTiempo() {
    }

    public void incluye(Titulo pelicula) {
        this.tiempoTotal += pelicula.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }
}
