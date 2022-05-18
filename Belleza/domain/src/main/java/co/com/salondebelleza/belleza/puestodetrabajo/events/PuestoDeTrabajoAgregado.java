package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.salondebelleza.belleza.puestodetrabajo.entity.Instrumento;
import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.DomainEvent;

public class PuestoDeTrabajoAgregado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final ReservacionId reservacionId;
    private final Instrumento instrumento;

    public PuestoDeTrabajoAgregado(EmpleadoId empleadoId, ReservacionId reservacionId, Instrumento instrumento) {
        super("co.com.salondebelleza.belleza.PuestoDeTrabajoAgregado");
        this.empleadoId = empleadoId;
        this.reservacionId = reservacionId;
        this.instrumento = instrumento;
    }

    public EmpleadoId EmpleadoId() {
        return empleadoId;
    }

    public ReservacionId ReservacionId() {
        return reservacionId;
    }

    public Instrumento Instrumento() {
        return instrumento;
    }
}
