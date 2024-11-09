import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Producto perecedero = new Perecedero("Manzanas", 2.5, LocalDate.of(2024, 11, 15));
        Producto noPerecedero = new NoPerecedero("Lentejas", 3.0, "Legumbre");
        Producto limpieza = new Limpieza("Detergente", 1.5, "500ml");

        Cliente cliente = new Cliente("Camilo", "Bernal", 101);
        Vendedor vendedor = new Vendedor("Carlos", "Restrepo", 202);

        System.out.println(perecedero);
        System.out.println(noPerecedero);
        System.out.println(limpieza);
        System.out.println(cliente);
        System.out.println(vendedor);
    }
}
