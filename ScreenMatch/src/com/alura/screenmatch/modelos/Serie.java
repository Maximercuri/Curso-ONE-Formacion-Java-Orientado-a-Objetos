package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Calificacion;

public class Serie extends Titulo implements Calificacion {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public int getTemporadas() {
        return this.temporadas;
    }

    public int getDuracionEnMinutos() {
        return this.temporadas * this.episodiosPorTemporada * this.minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return this.episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return this.minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getCalificacion() {
        return (int)(this.calculaMedia() / 2);
    }

    public String toString(){
        return "Serie: " + this.getNombre() + " (" + this.getFechaDeLanzamiento() + ")";
    }

}
