package com.alura.screenmatch.principal;

import com.alura.screenmatch.excepciones.ConversionException;
import com.alura.screenmatch.modelos.Titulo;
import com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson converter = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {

            System.out.println("Ingrese el nombre de la pelicula a buscar o 'salir' para finalizar el programa");
            var pelicula = teclado.nextLine();

            if(pelicula.equalsIgnoreCase("salir")){
                break;
            }

            // URL de la API para realizar la búsqueda
            String URL = "https://www.omdbapi.com/?t=" + pelicula.replace(" ", "+") + "&apikey=9fe87ada";


            /* CTRL + A: Seleccionar el documento entero, CTRL + ALT + I: identar aquello mal identado */

            try {
                /* Creación de un cliente dedicado a realizar búsquedas web*/
                HttpClient client = HttpClient.newHttpClient();

                /* Creación, mediante un builder, de un pedido de búsqueda que ejecuta la URL creada anteriormente*/
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(URL))
                        .build();

                /* Creación de la respuesta a un pedido de búsqueda que responde al request (pedido de búsqueda) del cliente */
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                //Se convierte el cuerpo del json (JavaScript Object Notation) obtenido en una constante
                String json = response.body();

                System.out.println(json);

                TituloOmdb miTituloOmdb = converter.fromJson(json, TituloOmdb.class);
                System.out.println(miTituloOmdb);


                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println(miTitulo);

                titulos.add(miTitulo);

            } catch (NumberFormatException e){
                System.out.println("Ocurrió un error: ");
                System.out.println(e.getMessage());
            } catch(IllegalArgumentException e){
                System.out.println("Error en la URI, verifique la dirección.");
            } catch (ConversionException e){
                System.out.println(e.getMessage());
            }

        }

        System.out.println(titulos);

        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(converter.toJson(titulos));
        escritura.close();

        System.out.println("Fin de la ejecución del programa");

    }

}
