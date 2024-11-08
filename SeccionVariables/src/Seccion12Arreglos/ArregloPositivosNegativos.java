package Seccion12Arreglos;

import java.util.Scanner;

public class ArregloPositivosNegativos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        int count = numeros.length;
        System.out.println("Ingrese 7 numeros enteros: ");

        try {
            int ingresado = 0, positivos = 0, negativos = 0, ceros = 0, sumaPositivos = 0, sumaNegativos = 0;
            for (int i = 0; i < count; i++) {
                ingresado = scanner.nextInt();
                if(ingresado > 1){
                    positivos++;
                    sumaPositivos += ingresado;
                } else if (ingresado < 0) {
                    negativos++;
                    sumaNegativos += ingresado;
                } else {
                    ceros++;
                }

            }

            double promedioPositivos = sumaPositivos/positivos;
            double promedioNegativos = sumaNegativos/negativos;

            System.out.println("Numeros positivos = " + positivos);
            System.out.println("Numeros negativos = " + negativos);
            System.out.println("Numeros ceros = " + ceros);
            System.out.println("Promedio de positivos = " + promedioPositivos);
            System.out.println("Promedio de negativos = " + promedioNegativos);


        } catch (Exception e){
            System.err.println("Ingrese los datos indicados");
            main(args);
            System.exit(-1);
        }

    }
}
