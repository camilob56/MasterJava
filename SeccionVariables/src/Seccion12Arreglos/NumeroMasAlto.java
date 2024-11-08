package Seccion12Arreglos;

import java.util.Scanner;

public class NumeroMasAlto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        int count = numeros.length;
         System.out.println("Ingrese 7 numeros enteros en el rango {11 - 99} : ");
        try {
            int ingresado = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < count; i++) {
                ingresado = scanner.nextInt();

                if(ingresado >= 11 && ingresado <= 99){
                    numeros[i] = ingresado;

                    if(numeros[i] > max){
                       max = numeros[i];
                    }

                }else{
                    System.out.println("Debe ingresar el numero en el rango indicado");
                    main(args);
                }
            }

            for (int i = 0; i < count; i++) {
                System.out.println("Indice " + i + " = " + numeros[i]);
            }
            System.out.println("El numero mas alto del arreglo es: " + max);


        } catch (Exception e){
            System.err.println("Ingrese los datos indicados");
            main(args);
            System.exit(-1);
        }


    }
}
