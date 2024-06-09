package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainConListas {
    public static void main(String[] args) {

        var miPelicula = new Pelicula("Encanto", 2021);
        var otraPelicula = new Pelicula("Matrix", 1998);
        var peliNueva = new Pelicula("El Señor De Los Anillos", 2001);
        var casaDragon = new Serie("La Casa Del Dragón", 2022);

        miPelicula.evalua(8.5);
        otraPelicula.evalua(3.1);
        peliNueva.evalua(2.1);
        casaDragon.evalua(2);

        /*
        Un Array es un tipo de dato estructurado que permite almacenar en su interior un conjunto de datos/variables homogéneos,
        es decir del mismo tipo (solo int, solo strings; etc.).

        "List" es una interfaz que es a su vez heredada de la interfaz "Collection" y ambos almacenan arrays.

        "Collection" es un array sin orden en específico (no contiene los métodos de ordenar o ver el valor de X posición).

        "List" es una colección de dato ordenada capaz de acceder a sus respectivos
        datos por el número de índice o ser ordenados mediante algún parametro elegido.

        Tipos de listas:
            ArrayList:  Es un array dinámico, es decir que almacena los elementos en su interior y a medida a medida que se agregan o quitan nuevos elementos,
                        el tamaño de la matriz se ajusta automáticamente para acomodar el nuevo elemento o en su defecto para removerlo.

            LinkedList: Proporciona una lista enlazada de elementos,
                        lo que significa que cada elemento de la lista es un objeto que contiene una referencia al siguiente elemento.
                        Esto permite agregar y eliminar elementos de manera eficiente en cualquier posición de la lista,
                        pero puede hacer que la búsqueda de un elemento específico sea menos eficiente.
                        LinkedList es una buena opción cuando insertar y eliminar elementos en cualquier posición de la lista es frecuente
                        y cuando no es necesario acceder a elementos aleatoriamente.

            Vector:     Es un array similar a ArrayList, pero está sincronizada lo que significa que es util para usar en threads simultáneos
                        (thread o subproceso es una característica de Java que permite la ejecución simultánea de dos o más partes de un programa
                        para la máxima utilización de la CPU. Cada parte de dicho programa se denomina thread/hilos.
                        Entonces, los hilos son procesos livianos dentro de un proceso.)
                        Aunque esto puede resultar muy util en muchas situaciones, la sincronización añade una sobrecarga de rendimiento,
                        por lo que utilizar un Vector puede ser más lento que ArrayList en algunas situaciones.

            Stack:      La clase Stack implementa una pila, que es una colección ordenada de elementos donde
                        la inserción y eliminación de elementos siempre ocurren en el mismo extremo de la lista.
                        Los elementos se agregan y eliminan en un orden conocido como "last-in, first-out" (LIFO),
                        es decir, el último elemento agregado es el primero en ser eliminado.
        */

        List<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliNueva);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula){
                System.out.println(pelicula.getCalificacion());
            }
        }

        /*
        Otras formas de definir el for anterior son:

        función "forEach" (a partir de java 8 se agregó esta función que comprime el for anterior):
        lista.forEach(item -> System.out.println(item));


        Method Reference (forma simplificada de una expresión lambda):
        lista.forEach(System.out::println);

         */

        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("Johnny Deep");
        artistas.add("Ricardo Darín");
        artistas.add("Jason Momoa");
        artistas.add("Ryan Gosling");

        System.out.println("Lista de artistas sin ordenar: " + artistas);

        Collections.sort(artistas);

        System.out.println("Lista de artistas ordenada: " + artistas);
        System.out.println("Lista de títulos sin ordenar: " + lista);

        Collections.sort(lista);

        System.out.println("Lista de títulos ordenada por nombre: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

        System.out.println("Lista de títulos ordenada por fecha de lanzamiento: " + lista);

    }

}

    /*
    Map es una interfaz que permite representar una estructura de datos para almacenar pares de datos denominados "clave y valor",
    de manera que para cada clave solamente tenga su respectivo valor asociado. Las claves pueden ser de cualquier tipo de objetos,
    aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double, etc.

    Clases que implementan la interfaz "Map":

              HashMap:  Los elementos que se insertan en el map no tendrán un orden específico. No aceptan claves duplicadas ni valores nulos.

              TreeMap:  El Mapa lo ordena de forma "natural". Por ejemplo, si la clave son valores enteros, los ordena de menor a mayor.

        LinkedHashMap:  Inserta en el Map los elementos en el orden en el que se van insertando; es decir,
                        que no tiene una ordenación de los elementos como tal,
                        por lo que esta clase realiza las búsquedas de los elementos de forma más lenta que las demás clases.

    */
