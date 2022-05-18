package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.Command;

public class EliminarReservacion extends Command {
    private final ReservacionId reservacionId;

    public EliminarReservacion(ReservacionId reservacionId) {
        this.reservacionId = reservacionId;
    }

    public ReservacionId ReservacionId() {
        return reservacionId;
    }
}
