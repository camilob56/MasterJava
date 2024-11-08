package Seccion12Arreglos;
import java.util.Scanner;

public class ArregloHistograma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int[] frecuencia = new int[6];
        int count = numeros.length;
        System.out.println("Ingrese 12 numeros enteros en el rango {1 - 6} : ");
        try {
            int ingresado = 0;
            for (int i = 0; i < count; i++) {
                ingresado = scanner.nextInt();
                if(ingresado >= 1 && ingresado <= 6){
                    frecuencia[ingresado - 1]++;
                }else{
                    System.out.println("Debe ingresar el numero en el rango indicado");
                    main(args);
                }

            }

            for (int i = 0; i < 6; i++) {
                System.out.print((i + 1) + ": ");
                for (int j = 0; j < frecuencia[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        } catch (Exception e){
            System.err.println("Ingrese los datos indicados");
            main(args);
            System.exit(-1);
        }

    }
}
