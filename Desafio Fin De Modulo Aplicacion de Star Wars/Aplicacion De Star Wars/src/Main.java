import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Consulta consulta = new Consulta();
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        GeneradorDeArchivos generador = new GeneradorDeArchivos();

        while(true){

            System.out.println("Escribe a continuación el numero de la pelicula que quieres averiguar o 0 para salir del programa");


            try{
                eleccion = teclado.nextInt();

                if(eleccion == 0){
                    break;
                }

                Pelicula pelicula = consulta.buscaPelicula(eleccion);

                System.out.println(pelicula);

                generador.guardarJson(pelicula);

            } catch (NumberFormatException e){
                System.out.println("Numero no encontrado:" + e.getMessage());
            } catch( RuntimeException | IOException e){
                System.out.println(e.getMessage());
                System.out.println("La aplicación se cerrará");
            }

        }


        System.out.println("Fin del programa");
    }
}