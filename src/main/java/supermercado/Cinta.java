package supermercado;

import java.util.ArrayList;
public class Cinta {
    //Creamos la clase cinta donde se almacenaran los productos

    private ArrayList<Producto> productos;

    public Cinta() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        //Creamos un método para que nos devuelva los productos
        return productos;
    }

    public void addProducto(Producto producto){
        //Creamos un método para que añada los productos
        productos.add(producto);
    }

    public void removeProducto(Producto producto){
        //Creamos un método para que elimine los productos
        productos.remove(producto);
    }

    public boolean vacia(){
        //Creamos un método para que nos diga si la cinta está vacía
        return productos.size() == 0;
    }

    public String generarLista() {
        //Creamos un método para que nos genere la lista de productos
        String lista = "";
        for (Producto producto : productos) {
            lista += producto.nombre() + " " +
                    producto.precio() + " " +
                    producto.cantidad() + " " +
                    producto.iva() + "% " + " 0" + " " +
                    producto.precio() * producto.cantidad() + "\n";

        }
        return lista;
    }
    //Ahora tenemos que generar la ultima parte del toString, que es el total de la compra, donde nos va a aparecer
    //el total de cada articulo, su iva y el total de la compra

    public String generarTotal() {
        //Creamos un método para que nos genere el total de la compra
        double total = 0;
        double iva = 0;
        for (Producto producto : productos) {
            total += producto.precio() * producto.cantidad();
            iva += producto.precio() * producto.cantidad() * producto.iva();
        }
        return "Total: " + total + " IVA: " + iva + " Total a pagar: " + (total + iva);
    }

    @Override
    public String toString() {
        return "Cinta{" + "cinta=" + productos + '}';
    }





}
