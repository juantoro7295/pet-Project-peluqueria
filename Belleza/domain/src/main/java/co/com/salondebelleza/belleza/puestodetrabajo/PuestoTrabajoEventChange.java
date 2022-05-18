package co.com.salondebelleza.belleza.puestodetrabajo;

import co.com.salondebelleza.belleza.puestodetrabajo.events.PuestoDeTrabajoAgregado;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;

/**
 * Evento de cambio Puesto De Trabajo
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */


public class PuestoTrabajoEventChange extends EventChange {
    /**
     * Evento de cambio - Agregar Puesto de Trabajo
     *
     * @param puestoTrabajo
     */
    public PuestoTrabajoEventChange(PuestoTrabajo puestoTrabajo) {
        apply((PuestoDeTrabajoAgregado event) -> {
            puestoTrabajo.empleadoId = event.EmpleadoId();
            puestoTrabajo.instrumento = event.Instrumento();
            puestoTrabajo.reservacionId = event.ReservacionId();
            puestoTrabajo.producto = new ArrayList<>();
        });

    }
}
