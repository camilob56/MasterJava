public class Empleado extends Persona{

    private Double remuneracion;
    private int empleadoOld;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadoOld) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoOld = empleadoOld;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoOld() {
        return empleadoOld;
    }

    public void setEmpleadoOld(int empleadoOld) {
        this.empleadoOld = empleadoOld;
    }

    public void aumentarRemuneracion(int porcentaje){
            this.remuneracion += this.remuneracion * porcentaje / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", Remuneración: " + remuneracion + ", Antigüedad: " + empleadoOld;
    }


}
