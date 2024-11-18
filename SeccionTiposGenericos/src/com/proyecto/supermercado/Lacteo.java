package com.proyecto.supermercado;

public class Lacteo extends Producto{

    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    @Override
    public String detallesProducto() {
        return "Nombre: " + getNombre() + ", Precio: $ " + getPrecio() +
                ", Cantidad: " + cantidad + ", Proteínas: " + proteinas;
    }

}
