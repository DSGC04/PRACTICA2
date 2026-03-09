package Problema;
import Problema.Pedido;
import Problema.Proveedor;
import java.time.LocalDate;
import java.util.ArrayList;

public class Mercancia {
  private String nombre;
    private int existencia;
    private LocalDate fechaUltimaEntrada;
    private int puntoDeReorden;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Pedido>pedidos;

    public Mercancia(String nombre, int existencia, LocalDate fechaUltimaEntrada, int puntoReorden) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.fechaUltimaEntrada = fechaUltimaEntrada;
        this.puntoDeReorden = puntoReorden;

        proveedores = new ArrayList<>();
        pedidos = new ArrayList<>();
    }
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void realizarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void actualizarExistencia(Pedido pedido) {
        existencia += pedido.getCantidadLlegada();
        fechaUltimaEntrada = pedido.getFechaLlegada();
    }
    public int getExistencia() {
        return existencia;
    }
    @Override
    public String toString() {
        return "Mercancia{" +
                "Nombre:" + nombre + "\n" +
                "Existencia:" + existencia + "\n"+
                "FechaUltimaEntrada:" + fechaUltimaEntrada +"\n" +
                "PuntoReorden:" + puntoDeReorden;
    }
}
