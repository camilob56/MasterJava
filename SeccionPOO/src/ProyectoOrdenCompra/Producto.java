package ProyectoOrdenCompra;

public class Producto {
    private int id;
    private static int ultimoId;
    private String nombre;
    private String fabricante;
    private double precio;

    public Producto(String nombre, String fabricante, double precio) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public Producto(){
        this.id = ++ultimoId;
    }


}
