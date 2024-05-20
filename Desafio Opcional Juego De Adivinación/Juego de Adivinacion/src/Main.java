import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Consigna: Crea un programa que simule un juego de adivinanzas.
        El programa debe generar un número aleatorio entre 0 y 100,
        pedir al usuario que intente adivinar ese número en un máximo de 5 intentos,
        y en cada intento el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.*/
        Scanner teclado = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int intentos = 5;
        int numeroElegido;
        System.out.println("Elige un numero entre 0 y 100 con el objetivo de adivinar el numero secreto en " + intentos + " intentos");
        while (intentos > 0) {
            numeroElegido = teclado.nextInt();
            intentos --;
            if (numeroElegido == numeroSecreto) {
                break; }
            else {
                if (numeroElegido < numeroSecreto) {
                    System.out.println("El numero secreto es mayor"); }
                else {
                    System.out.println("El numero secreto es menor"); }
                System.out.println("Numero erróneo. Te quedan " + intentos + " intentos");
            }
        }
        if (intentos == 0) {
            System.out.println("Lo siento, has fallado. El numero secreto era " + numeroSecreto); }
        else {
            System.out.println("¡Felicidades, has averiguado el numero secreto que era el " + numeroSecreto + " y con " + intentos + " intentos restantes!");
        }
    }
}
