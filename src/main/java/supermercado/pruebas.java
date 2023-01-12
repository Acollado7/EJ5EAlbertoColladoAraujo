package supermercado;

import java.util.ArrayList;

public class pruebas {
    public static void main(String[] args) {


        //Creamos un arrayList de productos

        ArrayList<Producto> productos = new ArrayList<>();

        //Añadimos los productos a la lista
        productos.add(new Producto("Leche", 1.5, 2, Iva.IVA4.getValor()));
        productos.add(new Producto("Pan", 0.5, 1, Iva.IVA10.getValor()));
        productos.add(new Producto("Cerveza", 1.5, 2, Iva.IVA21.getValor()));
        productos.add(new Producto("Coca-Cola", 1.5, 2, Iva.IVA21.getValor()));
        Caja caja = new Caja(new Cinta(productos));
        System.out.println(generarTicket(caja));

        //Usamos el metodo addProducto para añadir un producto a la lista
        caja.addProducto(new Producto("Agua", 1.5, 2, Iva.IVA21.getValor()));
        System.out.println(generarTicket(caja));

        //Usamos el metodo removeProducto para eliminar un producto de la lista
        caja.removeProducto(new Producto("Agua", 1.5, 2, Iva.IVA21.getValor()));
        System.out.println(generarTicket(caja));

        //Usamos el metodo vacia para comprobar si la cinta esta vacia
        System.out.println("¿Esta vacia la caja?  " + caja.vacia());


    }
    //Creamos un método para que nos genere el ticket
    public static Ticket generarTicket(Caja caja ) {
      return caja.generarTicket();
    }

}
