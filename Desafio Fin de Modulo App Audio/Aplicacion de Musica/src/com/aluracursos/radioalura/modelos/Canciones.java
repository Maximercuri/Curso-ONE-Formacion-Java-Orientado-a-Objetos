package com.aluracursos.radioalura.modelos;

import com.aluracursos.radioalura.calculos.Calificacion;

public class Canciones extends Audio implements Calificacion {

    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCalificacion() {
        return (int) (5*getTotalMeGusta()/getRepoduccionesTotales());
    }

    public void fichaDiscografica(){
        System.out.println("Cancion: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Album: " + getAlbum());
        System.out.println("Duración en minutos: "+ getDuracion());
        System.out.println("Genero: " + getGenero());
        System.out.println("Reproducciones totales: " + getRepoduccionesTotales());
        System.out.println("Me gusta totales: " + getTotalMeGusta());
    }

}
