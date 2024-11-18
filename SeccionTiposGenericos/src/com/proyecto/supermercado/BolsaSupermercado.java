package com.proyecto.supermercado;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable<T> {

    private List<T> elementos;
    private int max;

    public BolsaSupermercado(int max) {
        this.max = max;
        this.elementos = new ArrayList<>();
    }

    public void addProducto(T elemento){
        if(this.elementos.size() < max) {
            this.elementos.add(elemento);
        } else {
            throw new RuntimeException("No hay mas espacio.");
        }

    }

    public List<T> getProductos() { // Devuelve la lista
        return this.elementos;
    }

    @Override
    public Iterator<T> iterator() {
        return this.elementos.iterator();
    }

}
