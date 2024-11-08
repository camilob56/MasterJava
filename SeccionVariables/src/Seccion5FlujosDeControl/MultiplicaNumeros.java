package Seccion5FlujosDeControl;

import java.util.Scanner;

public class MultiplicaNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2 = scanner.nextInt();

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);

        int resultado = 0;

        boolean negativoPorNegativo = (numero1 < 0 && numero2 < 0);
        if (negativoPorNegativo) {
            numero1 = -numero1;
            numero2 = -numero2;
        }

        for (int i = 0; i < numero2; i++) {
            resultado += numero1;
        }

        System.out.println("El resultado de " + numero1 + " * " + numero2 + " es: " + resultado);


    }
}
