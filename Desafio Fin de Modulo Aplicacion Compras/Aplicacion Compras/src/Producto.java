public class Producto implements Comparable<Producto> {
    private double precio;
    private String nombre;

    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Compra: " +
                "Precio = $" + this.precio +
                ", Producto = " + this.nombre;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return Double.valueOf(this.precio).compareTo(Double.valueOf(otroProducto.precio));
    }
}
