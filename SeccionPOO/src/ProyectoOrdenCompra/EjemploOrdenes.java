package ProyectoOrdenCompra;
import java.text.ParseException;

public class EjemploOrdenes {
    public static void main(String[] args) throws ParseException {


        OrdenCompra orden1 = new OrdenCompra("Primera orden");
        orden1.setCliente(new Cliente("Camilo", "10942425" , "cll 35 norte 12 c"));
        orden1.setFecha("21-09-2023");
        orden1.addProducto(new Producto("Atun", "Van kangs", 24.322));
        orden1.addProducto(new Producto("Aceite","OLiva", 23.454));
        orden1.addProducto(new Producto("Leche","Colanta", 34.554));
        orden1.addProducto(new Producto("Huevos","El nido", 27.489));

        System.out.println(orden1.verOrden());
        System.out.println(orden1.precioTotal());

        OrdenCompra orden2 = new OrdenCompra("Segunda orden");
        orden2.setCliente(new Cliente("Pedro", "10934821" , "cll 45 norte 21 cs 2"));
        orden2.setFecha("23-09-2023");
        orden2.addProducto(new Producto("Arroz", "Diana", 34.322));
        orden2.addProducto(new Producto("Panela","Trebol", 20.454));
        orden2.addProducto(new Producto("Harina","Santa", 12.554));
        orden2.addProducto(new Producto("Cafe","Aguila", 27.489));

        System.out.println(orden2.verOrden());
        System.out.println(orden2.precioTotal());

        OrdenCompra orden3 = new OrdenCompra("Tercer orden");
        orden3.setCliente(new Cliente("Juanes", "1029384" , "kr 19 cll 5 - 12"));
        orden3.setFecha("28-09-2023");
        orden3.addProducto(new Producto("Sardina", "Van kangs", 26.322));
        orden3.addProducto(new Producto("Salchichas","Ranchera", 18.454));
        orden3.addProducto(new Producto("Frijoles","Trebol", 14.554));
        orden3.addProducto(new Producto("Papel","Familia", 25.489));

        System.out.println(orden3.verOrden());
        System.out.println(orden3.precioTotal());


    }
}
