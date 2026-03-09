package Problema;

public class Pedido {
   private Proveedor proveedor;
    private int cantidadPedida;
    private LocalDate fechaPedido;
    private int cantidadLlegada;
    private LocalDate fechaLlegada;

    public Pedido(Proveedor proveedor, int cantidadPedida, LocalDate fechaPedido) {
        this.proveedor = proveedor;
        this.cantidadPedida = cantidadPedida;
        this.fechaPedido = fechaPedido;
    }

    public void setCantidadLlegada(int cantidadLlegada) {
        this.cantidadLlegada = cantidadLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public int getCantidadLlegada() {
        return cantidadLlegada;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "proveedor" + proveedor + "\n" +
                "cantidadPedida" + cantidadPedida + "\n" +
                "fechaPedido" + fechaPedido + "\n" +
                "cantidad de Llegada" + cantidadLlegada + "\n" +
                "fecha de Llegada:" + fechaLlegada;
    }
}
