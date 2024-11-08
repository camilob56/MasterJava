package Seccion4Operadores;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String caracteres = "";
        String nombre1 = JOptionPane.showInputDialog("Por favor ingrese el primer nombre completo");
        String nombre2 = JOptionPane.showInputDialog("Por favor ingrese el segundo nombre completo");
        String nombre3 = JOptionPane.showInputDialog("Por favor ingrese el tercer nombre completo");

        caracteres = (nombre1.length() > nombre2.length()) ? nombre1 : nombre2;
        caracteres = (caracteres.length() >nombre3.length()) ? caracteres : nombre3;

        String mensaje = "Nombre 1: " + nombre1.concat("\nNombre 2: " + nombre2).concat("\nNombre 3: " + nombre3).concat("\n" + caracteres + " tiene el nombre más largo.");

        JOptionPane.showMessageDialog(null, mensaje);


    }
}
