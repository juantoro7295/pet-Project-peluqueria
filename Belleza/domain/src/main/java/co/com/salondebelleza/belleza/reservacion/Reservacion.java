package co.com.salondebelleza.belleza.reservacion;

import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Reservacion extends AggregateEvent<ReservacionId> {

    public Reservacion(ReservacionId reservacionId) {

        super(reservacionId);

    }
}
