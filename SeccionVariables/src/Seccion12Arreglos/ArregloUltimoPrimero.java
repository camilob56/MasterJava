package Seccion12Arreglos;

import java.util.Scanner;

public class ArregloUltimoPrimero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int [] orden = new int[10];

        System.out.println("Ingrese 10 numeros enteros");
        try {
            int count = numeros.length;
            for (int i = 0; i < count; i++) {
                numeros[i] = scanner.nextInt();
            }

            int aux = 0;
            for (int i = 0; i < count/2; i++) {
                orden[aux++] = numeros[count -1 -i];
                orden[aux++] = numeros[i];
            }

            for (int i = 0; i < count; i++) {
                System.out.println("Indice " + i + " = " + orden[i]);
            }



        } catch (Exception e){
            System.err.println("Ingrese los datos indicados");
            main(args);
            System.exit(-1);
        }



    }
}
