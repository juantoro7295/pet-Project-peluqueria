package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Fecha;
import co.com.salondebelleza.belleza.reservacion.entity.Cliente;
import co.com.salondebelleza.belleza.reservacion.entity.TipoServicio;
import co.com.sofka.domain.generic.DomainEvent;

public class ReservacionAgregada extends DomainEvent {
    private final Cliente cliente;
    private final TipoServicio tipoServicio;
    private final Fecha fecha;

    public ReservacionAgregada(Cliente cliente, TipoServicio tipoServicio, Fecha fecha) {
        super("co.com.salondebelleza.belleza.ReservacionAgregada");
        this.cliente = cliente;
        this.tipoServicio = tipoServicio;
        this.fecha = fecha;
    }

    public Cliente Cliente() {
        return cliente;
    }

    public TipoServicio TipoServicio() {
        return tipoServicio;
    }

    public Fecha Fecha() {
        return fecha;
    }
}
