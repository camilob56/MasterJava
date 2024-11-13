package org.project.catalogo.productos;

import org.project.catalogo.interfaces.IProducto;

abstract public class Producto implements IProducto {

    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }


    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                '}';
    }


}
