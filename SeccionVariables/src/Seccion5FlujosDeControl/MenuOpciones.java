package Seccion5FlujosDeControl;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuOpciones {
    public static void main(String[] args) {

        int opcionIndice = 0;
        do{

            Map<String, Integer> opciones = new HashMap();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                switch (opcionIndice){
                    case 1:
                        // actualizar
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                        break;
                    case 2:
                        // eliminar
                        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                        break;
                    case 3:
                        // agregar
                        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
                        break;
                    case 4:
                        // listar
                        JOptionPane.showMessageDialog(null, "Usuario listado");
                        break;
                    case 5:
                        //salir
                        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
                        break;

                }

            }

        }while (opcionIndice != 5);



    }
}
