public class Cliente extends Persona {
    private int idCliente;

    public Cliente(String nombre, String apellido, int idCliente) {
        super(nombre, apellido);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return "Cliente: " + super.toString() + ", ID: " + idCliente;
    }
}
