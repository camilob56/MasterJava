package Seccion8DateCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Por favor ingrese su fecha de nacimiento en formato dd/MM/yyyy");
        try {
            String fechaNacimiento = dateFormat.format(new Date(scanner.next()));
            System.out.println("Fecha de nacimiento ingresada = " + fechaNacimiento);

            String fechaActual = dateFormat.format(new Date());
            System.out.println("Fecha actual = " + fechaActual);

            int anioNacimiento = Integer.parseInt(fechaNacimiento.substring(6));
            int anioActual = Integer.parseInt(fechaActual.substring(6));
            int edad = anioActual-anioNacimiento;

            System.out.println("Su edad es = " + edad + " años.");



        }catch (Exception e){
            System.out.println("Ingrese un formato de fecha valido");
            main(args);
            System.exit(0);
        }

    }
}
