package co.com.salondebelleza.belleza.reservacion.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Fecha;
import co.com.salondebelleza.belleza.reservacion.entity.Cliente;
import co.com.salondebelleza.belleza.reservacion.entity.TipoServicio;
import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.Command;

public class CrearReservacion extends Command {

    private final ReservacionId reservacionId;
    private final Cliente cliente;
    private final TipoServicio tipoServicio;
    private final Fecha fecha;

    public CrearReservacion(ReservacionId reservacionId, Cliente cliente, TipoServicio tipoServicio, Fecha fecha) {
        this.reservacionId = reservacionId;
        this.cliente = cliente;
        this.tipoServicio = tipoServicio;
        this.fecha = fecha;
    }

    public ReservacionId ReservacionId() {
        return reservacionId;
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
