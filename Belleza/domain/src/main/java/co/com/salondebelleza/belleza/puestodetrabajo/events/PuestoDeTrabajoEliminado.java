package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.PuestoTrabajoId;
import co.com.sofka.domain.generic.DomainEvent;

public class PuestoDeTrabajoEliminado extends DomainEvent {
    private final PuestoTrabajoId puestoTrabajoId;

    public PuestoDeTrabajoEliminado(PuestoTrabajoId puestoTrabajoId) {
        super("co.com.salondebelleza.belleza.PuestoDeTrabajoEliminado");
        this.puestoTrabajoId = puestoTrabajoId;
    }

    public PuestoTrabajoId PuestoTrabajoId() {
        return puestoTrabajoId;
    }
}
