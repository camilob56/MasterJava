public class Vendedor extends Persona {
    private int idVendedor;

    public Vendedor(String nombre, String apellido, int idVendedor) {
        super(nombre, apellido);
        this.idVendedor = idVendedor;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor: " + super.toString() + ", ID: " + idVendedor;
    }
}
