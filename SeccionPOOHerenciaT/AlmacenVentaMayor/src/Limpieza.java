public class Limpieza extends Producto {
    private String contenidoNeto;

    public Limpieza(String nombre, double precio, String contenidoNeto) {
        super(nombre, precio);
        this.contenidoNeto = contenidoNeto;
    }

    public String getContenidoNeto() {
        return contenidoNeto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Contenido Neto: " + contenidoNeto;
    }
}
