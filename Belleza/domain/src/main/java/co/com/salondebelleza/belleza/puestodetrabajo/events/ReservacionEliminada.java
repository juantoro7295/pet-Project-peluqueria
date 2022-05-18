package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.DomainEvent;

public class ReservacionEliminada extends DomainEvent {
    private final ReservacionId reservacionId;

    public ReservacionEliminada(ReservacionId reservacionId) {
        super("co.com.salondebelleza.belleza.ReservacionEliminada");
        this.reservacionId = reservacionId;
    }

    public ReservacionId ReservacionId() {
        return reservacionId;
    }
}
