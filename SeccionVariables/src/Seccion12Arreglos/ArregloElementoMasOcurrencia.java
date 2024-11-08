package Seccion12Arreglos;
import java.util.Arrays;
import java.util.Scanner;

public class ArregloElementoMasOcurrencia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int count = numeros.length;
        System.out.println("Ingrese 10 numeros enteros en el rango {1 - 9} : ");
        try {
            int ingresado = 0;

            for (int i = 0; i < count; i++) {
                ingresado = scanner.nextInt();
                if(ingresado >= 1 && ingresado <= 9){
                    numeros[i] = ingresado;
                }else{
                    System.out.println("Debe ingresar el numero en el rango indicado");
                    main(args);
                }

            }

            Arrays.sort(numeros);

            int numeroMasRepetido = numeros[0];
            int maxFrecuencia = 1;
            int concurrencia = 0;
            for (int i = 0; i < count; i++) {
                concurrencia = 0;
                for (int j = 0; j < count; j++) {
                    if (numeros[i] == numeros[j]) {
                        concurrencia++;
                    }
                }
                if (concurrencia > maxFrecuencia) {
                    maxFrecuencia = concurrencia;
                    numeroMasRepetido = numeros[i];
                }
            }


            for (int i = 0; i < count; i++) {
                System.out.println("Indice " + i + " = " + numeros[i]);
            }

            System.out.println("La mayor ocurrencias es: " + maxFrecuencia);
            System.out.println("El elemento que mas se repite es: " + numeroMasRepetido);



        } catch (Exception e){
            System.err.println("Ingrese los datos indicados");
            main(args);
            System.exit(-1);
        }


    }
}
