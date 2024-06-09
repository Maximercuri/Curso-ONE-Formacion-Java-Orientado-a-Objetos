import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, escriba el limite de la tarjeta de crédito: ");
        double tope = teclado.nextDouble();
        var tarjeta = new TarjetaDeCredito(tope);

        int finPrograma = 1;

        while (finPrograma != 0){
            System.out.println("Escriba el nombre del producto a comprar: ");
            String nombre = teclado.next();

            System.out.println("Escriba el precio del producto a comprar: ");
            double precio = teclado.nextDouble();

            var compra = new Producto(precio, nombre);

            boolean compraConfirmada = tarjeta.confirmarCompra(compra);

            if (compraConfirmada){
                System.out.println("¡Compra Confirmada!");
                System.out.println("Saldo restante de la tarjeta: $" + tarjeta.getSaldo());
                System.out.println("Escriba 0 para salir del programa o 1 para continuar");
                finPrograma = teclado.nextInt();

            } else {
                System.out.println("¡Saldo Insuficiente!");
                finPrograma = 0;
            }

        }

        Collections.sort(tarjeta.getListaDeCompras());

        System.out.println("*****************************");
        System.out.println("COMPRAS REALIZADAS: ");

        for (Producto producto : tarjeta.getListaDeCompras()){
            System.out.println("PRODUCTO: " + producto.getNombre() + " --- $" + producto.getPrecio());
        }

        System.out.println("*****************************");
        System.out.println("Saldo restante de la tarjeta: $" + tarjeta.getSaldo());

    }

}
