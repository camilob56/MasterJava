package org.camilob.proyecto.vuelo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploVuelos {
    public static void main(String[] args) {

        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo("AAL 933", "New York", "Santiago", "29/08/2021", "05:39", 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", "31/08/2021", "04:45", 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", "30/08/2021","16:00",52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", "29/08/2021","13:22",59));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", "31/08/2021","14:05",25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", "31/08/2021","05:20",29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", "30/08/2021", "08:45", 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", "29/08/2021", "07:41", 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", "30/08/2021", "10:35", 48));
        vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", "29/08/2021", "09:14", 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", "31/08/2021", "08:33", 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", "31/08/2021", "15:15", 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", "30/08/2021", "08:14", 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", "29/08/2021", "22:53", 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", "31/08/2021", "09:57", 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", "31/08/2021", "04:00", 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", "29/08/2021", "07:45", 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", "30/08/2021", "07:12", 58));
        vuelos.add(new Vuelo("LAT 501", "París", "Santiago", "29/08/2021", "18:29", 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", "30/08/2021", "15:45", 39));


        vuelos.sort(
                Comparator.comparing(Vuelo::getFechaLlegada)
                        .thenComparing(Vuelo::getHoraLlegada)
        );

        System.out.println("----------------------------------------------------Orden vuelos por llegada---------------------------------------------------------");
        vuelos.forEach(System.out::println);

        System.out.println("----------------------------------------------------Ultimo vuelo-----------------------------------------------------------");
        System.out.println("El último vuelo en llegar es: " + vuelos.getLast());

        System.out.println("----------------------------------------------------Vuelo con menos pasajeros-----------------------------------------------------------");
        vuelos.sort(Comparator.comparing(Vuelo::getNumPasajeros));
        System.out.println("El vuelo con menor número de pasajeros es: " + vuelos.getFirst());

    }

}
