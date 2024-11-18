package com.proyecto.supermercado;

public class EjemploBolsaSupermercado {
    public static void main(String[] args) {

        System.out.println("===== Bolsa de supermercado # 1: Lácteos =====");
        BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado<>(5);
        bolsaLacteo.addProducto(new Lacteo("Leche Alquería", 6.435, 600, 578));
        bolsaLacteo.addProducto(new Lacteo("Yogurt Alpina", 3.245, 450, 320));
        bolsaLacteo.addProducto(new Lacteo("Queso Fresco", 5.120, 300, 210));
        bolsaLacteo.addProducto(new Lacteo("Mantequilla La Riviera", 2.850, 250, 150));
        bolsaLacteo.addProducto(new Lacteo("Crema de Leche", 4.350, 200, 180));

        for (Lacteo lacteo : bolsaLacteo.getProductos()) {
            System.out.println(lacteo.detallesProducto());
        }

        System.out.println("===== Bolsa de supermercado # 2: Frutas =====");
        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>(5);
        bolsaFruta.addProducto(new Fruta("Fresa", 5.768, 38.4, "Rojo"));
        bolsaFruta.addProducto(new Fruta("Manzana", 4.350, 45.0, "Verde"));
        bolsaFruta.addProducto(new Fruta("Banana", 3.245, 70.5, "Amarillo"));
        bolsaFruta.addProducto(new Fruta("Naranja", 3.120, 40.3, "Naranja"));
        bolsaFruta.addProducto(new Fruta("Pera", 4.050, 60.0, "Verde"));

        for (Fruta fruta : bolsaFruta.getProductos()) {
            System.out.println(fruta.detallesProducto());
        }

        System.out.println("===== Bolsa de supermercado # 3: No Perecibles =====");
        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>(5);
        bolsaNoPerecible.addProducto(new NoPerecible("Arroz", 2.560, 1000, 350));
        bolsaNoPerecible.addProducto(new NoPerecible("Harina", 1.745, 1500, 400));
        bolsaNoPerecible.addProducto(new NoPerecible("Azúcar", 1.990, 2000, 450));
        bolsaNoPerecible.addProducto(new NoPerecible("Pasta", 1.280, 500, 250));
        bolsaNoPerecible.addProducto(new NoPerecible("Lentejas", 2.030, 1000, 340));

        for (NoPerecible noPerecible : bolsaNoPerecible.getProductos()) {
            System.out.println(noPerecible.detallesProducto());
        }

        System.out.println("===== Bolsa de supermercado # 4: Limpieza =====");
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>(5);
        bolsaLimpieza.addProducto(new Limpieza("Detergente Ariel", 4.250, "Amonio cuaternario", 5.0));
        bolsaLimpieza.addProducto(new Limpieza("Limón Zote", 1.880, "Ácido cítrico", 3.0));
        bolsaLimpieza.addProducto(new Limpieza("Suavizante Downy", 6.120, "Frutas cítricas", 2.0));
        bolsaLimpieza.addProducto(new Limpieza("Limpiador Lysol", 5.120, "Alquitrán", 1.5));
        bolsaLimpieza.addProducto(new Limpieza("Jabón Germicida", 2.450, "Glicerina", 4.0));

        for (Limpieza limpieza : bolsaLimpieza.getProductos()) {
            System.out.println(limpieza.detallesProducto());
        }

    }
}
