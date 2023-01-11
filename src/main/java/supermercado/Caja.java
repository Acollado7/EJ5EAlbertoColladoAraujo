package supermercado;

import java.util.ArrayList;
import java.util.Objects;
public class Caja {

    private int numIdentificador;
    private Cinta productos;

    private static int id = 0;

    //Constructor
    public Caja(Cinta cinta) {
        this.numIdentificador = id++;
        this.productos = cinta;
    }
    //Getters y Setters

    public  int getNumIdentificador() {
        return numIdentificador;
    }

    public void setNumIdentificador (int numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    public Cinta getCinta() {
        return productos;
    }
     public void setCinta(Cinta productos) {
         this.productos = productos;

     }

     public static int getId() {
         return id;
     }

        public static void setId(int id) {
            Caja.id = id;
        }

        //insertamos hashCode y equals

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 79 * hash + this.numIdentificador;
            hash = 79 * hash + Objects.hashCode(this.productos);
            return hash;
        }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caja other = (Caja) obj;
        if (this.numIdentificador != other.numIdentificador) {
            return false;
        }
        return Objects.equals(this.productos, other.productos);
    }

    //toString

    @Override
    public String toString() {
        return "Caja{" + "numIdentificador=" + numIdentificador + ", productos=" + productos + '}';
    }

    public Ticket generarTicket() {

        Ticket t = new Ticket(this.productos);

        return t;
    }
}
