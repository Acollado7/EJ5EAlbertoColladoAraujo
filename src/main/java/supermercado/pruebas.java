package supermercado;

import java.util.ArrayList;

public class pruebas {
    public static void main(String[] args) {

        Caja caja = new Caja(new Cinta());
        //Creamos un arrayList de productos

        ArrayList<Producto> productos = new ArrayList<>();

        //Añadimos los productos a la lista
        productos.add(new Producto("Leche", 1.5, 2, 0.04));
        productos.add(new Producto("Pan", 0.5, 1, 0.10));
        productos.add(new Producto("Cerveza", 1.5, 2, 0.21));
        productos.add(new Producto("Coca-Cola", 1.5, 2, 0.21));


        generarTicket(caja);


    }
    //Creamos un método para que nos genere el ticket
    public static Ticket generarTicket(Caja caja ) {
      return caja.generarTicket();
    }
}
