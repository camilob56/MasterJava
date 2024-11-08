package Seccion4Operadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Estanque de gas \nCapacidad maxima 70 Litros \nCapacidad minima 1 Litro");
        double medida = 0;

        try{
            System.out.println("Ingrese la medida actual en litros");
            medida = scanner.nextDouble();
            if(medida == 70){
                System.out.println("El estanque esta lleno");
            }else if (medida>60 && medida<70){
                System.out.println("El estanque esta casi lleno");
            }else if (medida>40 && medida<60){
                System.out.println("El estanque esta 3/4");
            }else if (medida>35 && medida<40){
                System.out.println("El estanque esta Medio Estanque ");
            }else if (medida>20 && medida<35){
                System.out.println("El estanque esta Suficiente ");
            }else if (medida>1 && medida<20){
                System.out.println("El estanque esta Insuficiente ");
            }else {
                System.out.println("Verifique la capacidad maxima y minima del estanque !");
            }

        } catch (Exception e){
            System.out.println("Error, ingrese un dato valido");
            main(args);
            System.exit(0);
        }

    }

}
