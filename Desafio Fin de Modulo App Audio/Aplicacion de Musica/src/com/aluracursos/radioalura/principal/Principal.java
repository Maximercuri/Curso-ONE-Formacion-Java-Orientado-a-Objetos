package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Canciones;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Canciones cancion1 = new Canciones();

        cancion1.setTitulo("Do you wanna know?");
        cancion1.setDuracion(4);
        cancion1.setArtista("Arctic Monkeys");
        cancion1.setAlbum("AM");
        cancion1.setGenero("Rock alternativo");

        Podcast podcast1 = new Podcast();

        podcast1.setCreador("Jordi Wild");
        podcast1.setTitulo("The wild project #280 ft Isabel Viña");
        podcast1.setDuracion(90);
        podcast1.setDescripcion("""
                                Vivir hasta los 100 años (o más), aumentar nuestra libido, ganar músculo y fuerza, dormir
                                mejor, estar de buen humor... todas estas cosas, y muchas otras, son reguladas por las
                                hormonas, las grandes olvidadas cuando se habla de medicina. Por eso mismo, en este
                                episodio de The Wild Project, una de las mejores endocrinólogas del país, Isabel Viña, visita a
                                Jordi Wild para una charlar de las más útiles de la historia del podcast. Con consejos claros y
                                concisos, conoceremos hacks reales y científicos para mejorar nuestra vida y la de nuestra
                                gente querida. ¡No te lo pierdas!
                                """);
        for (int i = 0; i < 125; i++) {
            cancion1.meGusta();
        }

        for (int i = 0; i < 150; i++) {
            cancion1.reproducir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            podcast1.reproducir();

        }

        cancion1.fichaDiscografica();
        System.out.println(cancion1.getTitulo() + " tiene una calificación de " + cancion1.getCalificacion() + " de 5 estrellas");
        podcast1.fichaDiscografica();
        System.out.println(podcast1.getTitulo() + " tiene una calificación de " + podcast1.getCalificacion() + " de 5 estrellas");
    }
}
