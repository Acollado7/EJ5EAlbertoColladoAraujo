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

    }
    //Creamos un método para que nos genere el ticket
    public static Ticket generarTicket(Caja caja ) {
      return caja.generarTicket();
    }

}
