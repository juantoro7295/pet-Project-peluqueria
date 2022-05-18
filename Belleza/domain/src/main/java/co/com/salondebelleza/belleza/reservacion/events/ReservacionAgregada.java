package co.com.salondebelleza.belleza.reservacion.events;

import co.com.salondebelleza.belleza.reservacion.entity.Cliente;
import co.com.salondebelleza.belleza.reservacion.entity.TipoServicio;
import co.com.sofka.domain.generic.DomainEvent;

public class ReservacionAgregada extends DomainEvent {
    private final Cliente cliente;
    private final TipoServicio tipoServicio;

    public ReservacionAgregada(Cliente cliente, TipoServicio tipoServicio) {
        super("co.com.salondebelleza.belleza.ReservacionAgregada");
        this.cliente = cliente;
        this.tipoServicio = tipoServicio;

    }

    public Cliente Cliente() {
        return cliente;
    }

    public TipoServicio TipoServicio() {
        return tipoServicio;
    }
}
