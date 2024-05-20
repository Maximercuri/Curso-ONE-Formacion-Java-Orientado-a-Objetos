package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    protected int repoduccionesTotales;
    protected int totalMeGusta;
    protected int calificacion;

    public void meGusta() {
        this.totalMeGusta++;
    }

    public void reproducir() {
        this.repoduccionesTotales++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getRepoduccionesTotales() {
        return repoduccionesTotales;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

}
