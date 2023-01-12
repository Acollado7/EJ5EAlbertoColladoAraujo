package supermercado;

import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime fecha;
    private Cinta cinta;

    public Ticket(Cinta cinta) {
        this.fecha = LocalDateTime.now();
        this.cinta = cinta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Cinta getCinta() {
        return cinta;
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------------------------------------\n" +
                "                            Supermercados El Tarifa\n" +
                "Fecha: " + fecha.getDayOfMonth() +"/"+ fecha.getMonthValue() +"/"+ fecha.getYear() +  "                             Hora:" +  fecha.getHour() +":"+ fecha.getMinute() +"\n" +
                "-------------------------------------------------------------------------------------\n" +
                "Producto     Precio     Cantidad      IVA      Precio sin IVA\n" +
                "--------------------------------------------------------------------------------------\n" +
                cinta.generarLista() +
               "-------------------------------------------------------------------------------------\n" +
                cinta.generarStringTotal() +
                "------------------------------------------------------------------------------------\n";
    }


}


