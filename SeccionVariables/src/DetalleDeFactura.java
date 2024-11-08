import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el nombre de la factura o descripcion");
        String nombreFactura = scanner.nextLine();
        double productoUno =  0;
        double productoDos =  0;
        System.out.println("Digite el precio del primer producto");

        String errorDouble = "Error! debe ingresar numeros enteros o con decimales ' , ' ";

        try{
            productoUno = scanner.nextDouble();
        }catch (Exception e){
            System.out.println(errorDouble);
            main(args);
            System.exit(0);
        }

        System.out.println("Digite el precio del segundo producto");
        try{
            productoDos = scanner.nextDouble();
        }catch (Exception e){
            System.out.println(errorDouble);
            main(args);
            System.exit(0);
        }

        double totalBruto = productoUno + productoDos;
        double impuesto = 0.19;
        double totalImpuesto = totalBruto * impuesto;
        double totalNeto = totalBruto + totalImpuesto;

        System.out.println("Detalles de la factura " + nombreFactura + " :");
        System.out.println("El total bruto es = " + totalBruto);
        System.out.println("Con un impuesto de = " + totalImpuesto);
        System.out.println("El total neto despues de aplicar el impuesto es = " + totalNeto);

    }
}
