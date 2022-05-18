package co.com.salondebelleza.belleza.reservacion;

import co.com.salondebelleza.belleza.reservacion.entity.Cliente;
import co.com.salondebelleza.belleza.reservacion.entity.TipoServicio;
import co.com.salondebelleza.belleza.reservacion.events.ReservacionAgregada;
import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Reservacion extends AggregateEvent<ReservacionId> {

    protected Cliente cliente;
    protected TipoServicio tipoServicio;


    public Reservacion(ReservacionId entityId, Cliente cliente, TipoServicio tipoServicio) {
        super(entityId);
        appendChange(new ReservacionAgregada(cliente,tipoServicio)).apply();
        subscribe(new ReservacionEventChange(this));
    }

    public Reservacion(ReservacionId reservacionId) {
        super(reservacionId);
        subscribe(new ReservacionEventChange(this));
    }

    public Cliente Cliente() {
        return cliente;
    }

    public TipoServicio TipoServicio() {
        return tipoServicio;
    }
}
