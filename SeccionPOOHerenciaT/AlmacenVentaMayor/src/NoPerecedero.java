public class NoPerecedero extends ProductoAlimenticio {
    private String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo;
    }
}
