package org.project.catalogo;

import org.project.catalogo.interfaces.IProducto;
import org.project.catalogo.productos.*;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        IProducto[] productos = new Producto[6];

        productos[0] = new IPhone(688, "Apple", "iPhone 13", "Negro");
        productos[1] = new IPhone(699, "Apple", "iPhone SE", "Blanco");
        productos[2] = new TvLcd(555, "Samsung", 60);
        productos[3] = new TvLcd(654, "LG", 75);
        productos[4] = new Libro(208, new Date(2020 - 1900, 5, 10), "Harry Potter", "Bloomsbury", "J.K. Rowling");
        productos[5] = new Comics(932, new Date(2021 - 1900, 8, 15), "Stan Lee", "The Amazing Spider-Man", "Marvel", "Spiderman");

        for (IProducto producto : productos) {
            System.out.println(producto);
        }

    }

}
