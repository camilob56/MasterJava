package ProyectoOrdenCompra;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {
    private int id = 1;
    private static int ultimoId;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;

    private Producto[] productos = new Producto[4];

    private int indiceProductos = 0;

    public OrdenCompra(String descripcion) {
        this.id = ++ultimoId;
        this.descripcion = descripcion;
    }

    public OrdenCompra(String descripcion, Date fecha, Cliente cliente) {
        this(descripcion);
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(fecha);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(String fechaString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.fecha = dateFormat.parse(fechaString);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public OrdenCompra addProducto(Producto producto){
        // Verificar si el producto ya está en la lista
        boolean productoRepetido = false;
        for (int i = 0; i < indiceProductos; i++) {
            if (productos[i] != null && productos[i].getNombre().equals(producto.getNombre())) {
                productoRepetido = true;
                System.out.println("Producto repetido: " + producto.getNombre());
                break;
            }
        }

        if (!productoRepetido && indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        } else if (productoRepetido) {
            System.out.println("No se agrega el producto repetido.");
            System.exit(0);
        }
        return this;
    }

    public String verOrden(){
        String informacion =  "ID Orden: " + this.getId() +
                "\nDescripcion: " + this.getDescripcion() +
                "\nFecha: " + this.getFecha();

        if (this.getCliente() != null){
            informacion += "\nNombre cliente:  "+ this.getCliente().getNombre() +
                    "\ndocumento: " + this.getCliente().getDocumento() +
                    "\ndireccion: " + this.getCliente().getDireccion();
        }

        if (getProductos() != null){
            informacion += "\nProductos de la orden:";
            for (Producto producto: this.getProductos()) {
                informacion += "\nNombre: " + producto.getNombre() + ", Fabricante: " + producto.getFabricante() + ", Precio: " + producto.getPrecio();
            }
        }

        return informacion;
    }

    public String precioTotal (){
        String informacion = "";
        double total = 0;
        for (Producto producto: this.getProductos()) {
            double precio = producto.getPrecio();
            total += precio;
        }
        informacion += "Precio total de la orden: " + total;
        return informacion;
    }




}
