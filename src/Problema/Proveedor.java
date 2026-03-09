package Problema;

public class Proveedor {
    private String nombre;
    private String telefono;
    private String direccion;

    public Proveedor(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    @Override
    public String toString() {
        return "Proveedor:" + "\n" +
                "Nombre:" + nombre + "\n" +
                "Telefono: " + telefono + "\n" +
                "Direccion:'" + direccion + "\n";
    }
}
