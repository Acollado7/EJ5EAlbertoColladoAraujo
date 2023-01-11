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
        return "Ticket{" +
                "fecha=" + fecha +
                ", cinta=" + cinta +
                '}';
    }
}
