public class Main {
    public static void main(String[] args) {

        Producto[] productos = new Producto[8];

        productos[0] = new Fruta("Manzana", 1.5, 200, "Dulce");
        productos[1] = new Fruta("Pera", 2.0, 150, "Ácida");


        productos[2] = new Limpieza("Detergente", 3.0, "Líquido", 2.00);
        productos[3] = new Limpieza("Jabón", 2.5, "Pastilla", 1.400);


        productos[4] = new Lacteo("Leche", 5.600, 200, 150);
        productos[5] = new Lacteo("Yogur", 2.800, 80, 86);


        productos[6] = new NoPerecible("Arroz", 3.600, 500, 600);
        productos[7] = new NoPerecible("Fideos", 5.00, 360, 200);

        for (Producto producto : productos) {
            System.out.println(producto);
        }

    }
}