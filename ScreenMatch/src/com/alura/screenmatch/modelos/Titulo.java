package com.alura.screenmatch.modelos;

import com.alura.screenmatch.excepciones.ConversionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidaEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int TotalDeEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ConversionException("Imposible conversion pues contiene un N/A en algun campo necesario para su conversión");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ", ""));
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTotalDeEvaluaciones() {
        return this.TotalDeEvaluaciones;
    }

    public double getSumaDeLasEvaluaciones() {
        return this.sumaDeLasEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("EL nombre la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Su duración en minutos es: " + duracionEnMinutos);
    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        ++TotalDeEvaluaciones;
    }

    public double calculaMedia() {
        return this.sumaDeLasEvaluaciones / this.TotalDeEvaluaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidaEnElPlan(boolean incluidaEnElPlan) {
        this.incluidaEnElPlan = incluidaEnElPlan;
    }

    public int getFechaDeLanzamiento() {
        return this.fechaDeLanzamiento;
    }

    public boolean isIncluidaEnElPlan() {
        return this.incluidaEnElPlan;
    }

    public int getDuracionEnMinutos() {
        return this.duracionEnMinutos;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre: " + nombre +
               ", fechaDeLanzamiento: " + fechaDeLanzamiento +
               ", duración: " + duracionEnMinutos + ")";                                 ;
    }

}
