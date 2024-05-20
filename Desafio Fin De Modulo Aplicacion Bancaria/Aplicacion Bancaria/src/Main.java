import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double Saldo = 1599.99;
        double movimientoDeDinero = 0;
        int eleccion = 0;
        String Inicio = """
                        ******************************************************************
                        
                        Nombre del cliente: Tony Stark
                        Tipo de cuenta: Corriente
                        Saldo disponible: $1599,99
                        
                        ******************************************************************
                        """;
        String Menu = """
                      ** Escriba el número de la opción deseada **
                      1 - Consultar Saldo
                      2 - Retirar dinero
                      3 - Depositar dinero
                      9 - Salir
                      """;
        System.out.println(Inicio);
        while (eleccion != 9){
            System.out.println(Menu);
            eleccion = teclado.nextInt();
            switch (eleccion){
                case 1:
                    System.out.println("El saldo actualizado es: $" + Saldo);
                    break;
                case 2:
                    System.out.println("¿Cuanto dinero deseas retirar?");
                    movimientoDeDinero = teclado.nextDouble();
                    if (movimientoDeDinero <= Saldo){
                        Saldo -= movimientoDeDinero;
                        System.out.println("Saldo restante: $" + Saldo); }
                    else {
                        System.out.println("Saldo Insuficiente"); }
                    break;
                case 3:
                    System.out.println("¿Cuanto dinero deseas depositar?");
                    movimientoDeDinero = teclado.nextDouble();
                    Saldo += movimientoDeDinero;
                    System.out.println("Saldo actualizado: $ " + Saldo);
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("No corresponde a ninguna opción valida, seleccione otra opción");
                    break; }
        }
    }
}