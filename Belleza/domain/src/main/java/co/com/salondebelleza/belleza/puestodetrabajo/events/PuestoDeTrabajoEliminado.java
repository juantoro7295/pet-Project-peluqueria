package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.PuestoTrabajoId;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * Evento Puesto de Trabajo Eliminado
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class PuestoDeTrabajoEliminado extends DomainEvent {
    private final PuestoTrabajoId puestoTrabajoId;

    /**
     * Constructor PuestoDeTrabajoEliminado
     * @param puestoTrabajoId
     */
    public PuestoDeTrabajoEliminado(PuestoTrabajoId puestoTrabajoId) {
        super("co.com.salondebelleza.belleza.PuestoDeTrabajoEliminado");
        this.puestoTrabajoId = puestoTrabajoId;
    }

    /**
     * Obtener Puesto de trabajo id
     * @return PuestoTrabajoId
     */
    public PuestoTrabajoId PuestoTrabajoId() {
        return puestoTrabajoId;
    }
}
