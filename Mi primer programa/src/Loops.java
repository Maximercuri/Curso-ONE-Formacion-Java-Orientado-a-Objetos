import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaDeLasNotas = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe que nota le darías a la pelicula Matrix");
            nota = teclado.nextDouble();
            mediaDeLasNotas = mediaDeLasNotas + nota; }
        System.out.println("La media de las notas de la pelicula Matrix es: " + mediaDeLasNotas / 3);
    }
}
