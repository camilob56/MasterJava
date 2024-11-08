package Seccion10Math;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        try {
            double radio = scanner.nextDouble();
            double area = Math.PI*Math.pow(radio, 2);
            System.out.println("Radio ingresado: " + radio);
            System.out.println("El area del circulo es = " + area);


        } catch (Exception e) {
            System.err.println("Por favor ingrese un tipo de dato numerico");
            main(args);

        }


    }
}
