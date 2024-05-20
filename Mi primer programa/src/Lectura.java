import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe su fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por ultimo, ponle una clasificación del 1 al 10 (puede incluir decimales)");
        double calificacion = teclado.nextDouble();
        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(calificacion);
    }
}
