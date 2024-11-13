package org.project.catalogo.productos;

import org.project.catalogo.interfaces.IElectronico;

abstract public class Electronico extends Producto implements IElectronico{

    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return "Electronico{" +
                "fabricante='" + fabricante + '\'' +
                '}';
    }

}
