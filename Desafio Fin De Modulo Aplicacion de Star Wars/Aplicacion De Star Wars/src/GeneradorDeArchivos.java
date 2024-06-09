import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivos {

    public void guardarJson(Pelicula pelicula) throws IOException {

        Gson converter = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter escritura = new FileWriter(pelicula.title() + ".json");
        escritura.write(converter.toJson(pelicula));
        escritura.close();

    }
}
