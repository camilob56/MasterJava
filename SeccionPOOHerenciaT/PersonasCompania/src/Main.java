public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Camilo", "Bernal", "123456789", "Calle 123", 5000.0, 5, 20000.0);


        System.out.println(gerente.toString());


        gerente.aumentarRemuneracion(10);
        System.out.println("Después de aumento: " + gerente.toString());


    }
}