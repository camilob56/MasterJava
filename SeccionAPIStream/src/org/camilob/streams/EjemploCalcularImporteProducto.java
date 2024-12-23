package org.camilob.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploCalcularImporteProducto {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Leche", 100, 3.900));
        productos.add(new Producto("Pan", 50, 1.500));
        productos.add(new Producto("Arroz", 30, 2.100));
        productos.add(new Producto("Aceite", 25, 4.200));
        productos.add(new Producto("Jabón", 60, 1.000));
        productos.add(new Producto("Cereal", 40, 2.750));
        productos.add(new Producto("Queso", 15, 5.500));
        productos.add(new Producto("Pollo", 10, 8.900));
        productos.add(new Producto("Frijoles", 50, 3.300));
        productos.add(new Producto("Tomates", 20, 2.400));

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        double total = productos.stream()
                .mapToDouble(producto -> producto.getPrecio() * producto.getCantidad())
                .sum();
        System.out.println("Gran Total: " + total);


    }
}
