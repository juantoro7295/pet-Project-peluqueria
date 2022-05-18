package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * Evento Empleado Eliminado
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class EmpleadoEliminado extends DomainEvent {

    private final EmpleadoId empleadoId;

    /**
     * Constructor EmpleadoEliminado
     *
     * @param empleadoId
     */
    public EmpleadoEliminado(EmpleadoId empleadoId) {
        super("co.com.salondebelleza.belleza.EmpleadoEliminado");
        this.empleadoId = empleadoId;
    }

    /**
     * Obtener Empleado Id
     *
     * @return EmpleadoId
     */
    public EmpleadoId EmpleadoId() {
        return empleadoId;
    }
}
