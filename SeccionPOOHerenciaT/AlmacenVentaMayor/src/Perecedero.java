import java.time.LocalDate;

public class Perecedero extends ProductoAlimenticio {
    private LocalDate fechaCaducidad;

    public Perecedero(String nombre, double precio, LocalDate fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha de Caducidad: " + fechaCaducidad;
    }
}
