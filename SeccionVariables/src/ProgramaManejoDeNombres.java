import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Por favor ingrese el primer nombre");
        String nombre1 = scanner.nextLine();
        System.out.println("Por favor ingrese el segundo nombre");
        String nombre2 = scanner.nextLine();
        System.out.println("Por favor ingrese el tercer nombre");
        String nombre3 = scanner.nextLine();

        char caracter1 = nombre1.charAt(1);
        char caracter2 = nombre2.charAt(1);
        char caracter3 = nombre3.charAt(1);

        String modificar1 = Character.toString(caracter1).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2));
        String modificar2 = Character.toString(caracter2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));
        String modificar3 = Character.toString(caracter3).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));
        sb.append(modificar1).append("_").append(modificar2).append("_").append(modificar3);
        System.out.println(sb.toString());



    }
}
