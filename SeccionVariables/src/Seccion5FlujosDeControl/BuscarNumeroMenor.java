package Seccion5FlujosDeControl;

import java.util.Scanner;

public class BuscarNumeroMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = 0;
        System.out.println("Ingresa la cantidad de números a comparar");

        try {
            cantidadNumeros = scanner.nextInt();
            int ingresado = 0;
            int menor = Integer.MAX_VALUE; // al numero menor le asignamos el maximo valor

            for(int i = 1; i <= cantidadNumeros; i++){

                System.out.println("Ingresa el numero " + i);
                try {
                    ingresado = scanner.nextInt();
                    if (ingresado < menor) {
                        menor = ingresado;
                    }
                    // menor = (ingresado < menor) ? ingresado : menor;
                }catch (Exception e){
                    System.out.println("Por favor ingrese numeros enteros");
                }

            }
            System.out.println("El menor es: " + menor);
            if(menor < 10){
                System.out.println("El número " + menor + "  es menor que 10!");
            }else {
                System.out.println("El numero " + menor + " es igual o mayor que 10!");
            }


        } catch (Exception e){
            System.out.println("Por favor ingrese numeros enteros");
            main(args);
            System.exit(0);
        }


    }
}
