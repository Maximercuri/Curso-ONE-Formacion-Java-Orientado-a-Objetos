package com.aluracursos.radioalura.modelos;

import com.aluracursos.radioalura.calculos.Calificacion;

public class Podcast extends Audio implements Calificacion {

    private String creador;
    private String descripcion;

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCalificacion() {
        if (getTotalMeGusta() == getRepoduccionesTotales()) {
            return 5;
        } else if (getTotalMeGusta() >= (int) (getRepoduccionesTotales()/2)){
            return 3;
        } else {
            return 1;
        }
    }

    public void fichaDiscografica(){
        System.out.println("Titulo del capitulo: " + getTitulo());
        System.out.println("Creador: " + getCreador());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Duración en minutos: "+ getDuracion());
        System.out.println("Reproducciones totales: " + getRepoduccionesTotales());
        System.out.println("Me gusta totales: " + getTotalMeGusta());
    }

}