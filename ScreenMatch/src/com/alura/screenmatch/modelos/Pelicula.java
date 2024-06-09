package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Calificacion;

public class Pelicula extends Titulo implements Calificacion {
    private String Director;

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirector() {
        return this.Director;
    }

    public void setDirector(String director) {
        this.Director = director;
    }

    public int getCalificacion() {
        return (int)(this.calculaMedia() / 2);
    }

    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + this.getFechaDeLanzamiento() + ")";
    }
}
