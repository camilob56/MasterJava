package org.project.catalogo.productos;

import org.project.catalogo.interfaces.IProducto;

public class IPhone extends Electronico{

    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }

    @Override
    public String toString() {
        return "IPhone {\n" +
                "  Modelo: '" + modelo + "',\n" +
                "  Color: '" + color + "',\n" +
                "  Fabricante: '" + getFabricante() + "',\n" +
                "  Precio: $" + getPrecio() + "\n" +
                '}';
    }

}