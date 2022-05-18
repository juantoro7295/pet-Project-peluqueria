package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Fecha;
import co.com.salondebelleza.belleza.puestodetrabajo.values.PuestoTrabajoId;
import co.com.salondebelleza.belleza.reservacion.entity.Cliente;
import co.com.salondebelleza.belleza.reservacion.entity.TipoServicio;
import co.com.sofka.domain.generic.Command;

public class AgregarReservacion extends Command {
    private final PuestoTrabajoId puestoTrabajoId;
    private final Cliente cliente;
    private final TipoServicio tipoServicio;
    private final Fecha fecha;

    public AgregarReservacion(PuestoTrabajoId puestoTrabajoId, Cliente cliente, TipoServicio tipoServicio, Fecha fecha) {
        this.puestoTrabajoId = puestoTrabajoId;
        this.cliente = cliente;
        this.tipoServicio = tipoServicio;
        this.fecha = fecha;
    }


    public PuestoTrabajoId PuestoTrabajoId() {
        return puestoTrabajoId;
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
