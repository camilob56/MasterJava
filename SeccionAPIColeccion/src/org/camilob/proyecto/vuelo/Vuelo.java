package org.camilob.proyecto.vuelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vuelo {

    private String nombreVuelo;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private Date horaLlegada;
    private int numPasajeros;

    public Vuelo(String nombreVuelo, String origen, String destino, String fechaLlegada, String horaLlegada, int numPasajeros) {
        this.nombreVuelo = nombreVuelo;
        this.origen = origen;
        this.destino = destino;
        try {
            this.fechaLlegada = formatearDate(fechaLlegada, "dd/MM/yyyy");
            this.horaLlegada = formatearDate(horaLlegada, "HH:mm");
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha u hora: " + e.getMessage());
        }
        this.numPasajeros = numPasajeros;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

        return "Nombre: " + nombreVuelo +
                ", Origen: " + origen +
                ", Destino: " + destino +
                ", Fecha de llegada: " + formatoFecha.format(fechaLlegada) +
                ", Hora de llegada: " + formatoHora.format(horaLlegada) +
                ", Numero de pasajeros: " + numPasajeros;
    }

    public static Date formatearDate(String fechaStr, String formato) throws ParseException {
        SimpleDateFormat formatoFecha = new SimpleDateFormat(formato);
        return formatoFecha.parse(fechaStr);
    }

}
