import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaDeLasNotas = 0;
        double totalDeEvaluaciones = 0;
        while (nota != -1){
            System.out.println("Escribe la nota que le darías a la pelicula Matrix: (escribe -1 para salir de la iteración)");
            nota = teclado.nextDouble();
            if (nota != -1){
                mediaDeLasNotas += nota;
                totalDeEvaluaciones ++; }
        }
        System.out.println("La media de las evaluaciones brindadas de la pelicula matrix es " + mediaDeLasNotas / totalDeEvaluaciones);
    }
}
