package com.alura.screenmatch.principal;

import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroDeRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var calculadora = new CalculadoraDeTiempo();

        var filtro = new FiltroDeRecomendacion();

        var miPelicula = new Pelicula("Encanto", 2021);

        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidaEnElPlan(false);
        miPelicula.setDirector("Byron Howard y Jared Bush");

        miPelicula.evalua(10.0);
        miPelicula.evalua(10.0);
        miPelicula.evalua(6.6);

        miPelicula.muestraFichaTecnica();

        System.out.println("La suma de todas sus calificaciones es " + miPelicula.getSumaDeLasEvaluaciones());
        System.out.println("Se han hecho un total de " + miPelicula.getTotalDeEvaluaciones() + " calificaciones a esta pelicula");
        System.out.println("La media de las calificaciones a esta pelicula es de " + miPelicula.calculaMedia());

        filtro.filtra(miPelicula);

        var otraPelicula = new Pelicula("Matrix", 1998);

        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.setIncluidaEnElPlan(true);
        otraPelicula.setDirector("Lana Wachowski y Lilly Wachowski");

        otraPelicula.evalua(7.9);
        otraPelicula.evalua(3.2);
        otraPelicula.evalua(10.0);

        otraPelicula.muestraFichaTecnica();

        System.out.println("La suma de todas sus calificaciones es " + otraPelicula.getSumaDeLasEvaluaciones());
        System.out.println("Se han hecho un total de " + otraPelicula.getTotalDeEvaluaciones() + " calificaciones a esta pelicula");
        System.out.println("La media de las calificaciones a esta pelicula es de " + otraPelicula.calculaMedia());

        filtro.filtra(otraPelicula);

        var casaDragon = new Serie("La Casa Del Dragón", 2022);

        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setIncluidaEnElPlan(false);

        casaDragon.evalua(9.5);
        casaDragon.evalua(9.5);
        casaDragon.evalua(9.5);

        casaDragon.muestraFichaTecnica();

        System.out.println("La duración total de esta serie es de " + casaDragon.getDuracionEnMinutos() + " minutos");
        System.out.println("La suma de todas sus calificaciones es " + casaDragon.getSumaDeLasEvaluaciones());
        System.out.println("Se han hecho un total de " + casaDragon.getTotalDeEvaluaciones() + " calificaciones a esta pelicula");
        System.out.println("La media de las calificaciones de esta serie es de " + casaDragon.calculaMedia());

        filtro.filtra(casaDragon);

        var episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtro.filtra(episodio);

        var peliNueva = new Pelicula("El Señor De Los Anillos", 2001);

        peliNueva.setDuracionEnMinutos(180);
        peliNueva.setIncluidaEnElPlan(true);
        peliNueva.setDirector("Peter Jackson");

        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        calculadora.incluye(peliNueva);

        System.out.println("Ver todos los elementos agregados hasta ahora es de  " + calculadora.getTiempoTotal() + " minutos en total");

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();

        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliNueva);

        System.out.println("El tamaño de la lista es de " + listaDePeliculas.size() + " elementos");
        System.out.println("El primer elemento de la lista es: " + listaDePeliculas.get(0).getNombre() );
        System.out.println(listaDePeliculas);

    }

}