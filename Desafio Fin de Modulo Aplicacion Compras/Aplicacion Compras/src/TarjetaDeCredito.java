import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Producto> listaDeCompras;

    public TarjetaDeCredito(double tope) {
        this.limite = tope;
        this.saldo = tope;
        this.listaDeCompras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Producto> getListaDeCompras() {
        return listaDeCompras;
    }

    public boolean confirmarCompra(Producto producto){
        if(this.saldo >= producto.getPrecio()){
            this.saldo -= producto.getPrecio();
            listaDeCompras.add(producto);
            return true;
        }
        return false;
    }

}