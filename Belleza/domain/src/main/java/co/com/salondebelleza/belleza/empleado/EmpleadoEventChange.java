package co.com.salondebelleza.belleza.empleado;

import co.com.salondebelleza.belleza.empleado.events.EmpleadoAgregado;
import co.com.sofka.domain.generic.EventChange;

/**
 * Evento de cambio de Empleado
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class EmpleadoEventChange extends EventChange {
    /**
     * Evento de cambio Empleado, Empleado Agregado
     *
     * @param empleado
     */
    public EmpleadoEventChange(Empleado empleado) {
        apply((EmpleadoAgregado event) -> {
            empleado.nombre = event.getNombre();
            empleado.contrato = event.getContrato();
            empleado.rol = event.getRol();
        });
    }
}
