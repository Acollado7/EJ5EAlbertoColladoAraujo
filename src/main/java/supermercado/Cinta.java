package supermercado;

import java.util.ArrayList;
public class Cinta {
    //Creamos la clase cinta donde se almacenaran los productos

    private ArrayList<Producto> productos;

    public Cinta(ArrayList<Producto> productos) {
        this.productos = productos;
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


    //Ahora tenemos que generar la ultima parte del toString, que es el total de la compra, donde nos va a aparecer
    //el total de cada articulo, su iva y el total de la compra



    @Override
    public String toString() {
        return "Cinta{" + "cinta=" + productos + '}';
    }

//creamos un metodo que nos cree un for para introducir los productos al ticket

    public String generarLista() {
        //Creamos un método para que nos genere la lista de productos
        String lista = "";
        for (Producto producto : productos) {
            lista += producto.nombre() + "          " +
                    producto.precio() + "            " +
                    producto.cantidad() + "          " +
                    producto.iva() + "% "  + "            " +
                    producto.precio() * producto.cantidad() + "\n";

        }
        return lista;
    }


    public String generarStringTotal() {

        int contador4 = 0;
        int contador10 = 0;
        int contador21 = 0;

        double precio4 = 0;
        double precio10 = 0;
        double precio21 = 0;

        String info4 = "";
        String info10 = "";
        String info21 = "";

        String infoPrecioAPagar = "";

        String infoTotal = "";

        for (Producto producto : productos) {

            if (producto.iva() == 4) {
                contador4 += producto.cantidad();
                precio4 += producto.precio() * producto.cantidad();
            }
            if (producto.iva() == 10) {
                contador10 += producto.cantidad();
                precio10 += producto.precio() * producto.cantidad();
            }
            if (producto.iva() == 21) {
                contador21 += producto.cantidad();
                precio21 += producto.precio() * producto.cantidad();
            }

        }
        info4 = "Nºprod. iva4%: " + contador4 + "            Precio sin IVA: " + precio4 + "          Precio con IVA: " + (precio4 + (precio4 * 0.04));
        info10 = "Nºprod. iva10%: " + contador10 + "          Precio sin IVA: " + precio10 + "          Precio con IVA: " + (precio10 + (precio10 * 0.1));
        info21 = "Nºprod. iva21%: " + contador21 + "          Precio sin IVA: " + precio21 + "          Precio con IVA: " + (precio21 + (precio21 * 0.21));

        infoPrecioAPagar = "-------------------------------------------------------------------\n"
                + "Total a pagar: " + ((precio4 + (precio4 * 0.04)) + (precio10 + (precio10 * 0.1)) + (precio21 + (precio21 * 0.21)) + "  --  Gracias por su visita\n")
                + "---------------------------------------------------------------------";
        infoTotal = info4 + "\n" + info10 + "\n" + info21 + "\n" + infoPrecioAPagar;

        return infoTotal;

    }




}
