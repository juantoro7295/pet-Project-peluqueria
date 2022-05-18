package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoEliminado extends DomainEvent {

    private final EmpleadoId empleadoId;

    public EmpleadoEliminado(EmpleadoId empleadoId) {
        super("co.com.salondebelleza.belleza.EmpleadoEliminado");
        this.empleadoId = empleadoId;
    }
}
