package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.salondebelleza.belleza.puestodetrabajo.entity.Instrumento;
import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * Evento Puesto de Trabajo Agregado
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class PuestoDeTrabajoAgregado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final ReservacionId reservacionId;
    private final Instrumento instrumento;

    /**
     * Constructor PuestoDeTrabajoAgregado
     * @param empleadoId
     * @param reservacionId
     * @param instrumento
     */
    public PuestoDeTrabajoAgregado(EmpleadoId empleadoId, ReservacionId reservacionId, Instrumento instrumento) {
        super("co.com.salondebelleza.belleza.PuestoDeTrabajoAgregado");
        this.empleadoId = empleadoId;
        this.reservacionId = reservacionId;
        this.instrumento = instrumento;
    }

    /**
     * Obtener Empleado Id
     * @return EmpleadoId
     */
    public EmpleadoId EmpleadoId() {
        return empleadoId;
    }

    /**
     * Obtener Reservacion Id
     * @return ReservacionId
     */
    public ReservacionId ReservacionId() {
        return reservacionId;
    }

    /**
     * Obtener Instrumento
     * @return Instrumento
     */
    public Instrumento Instrumento() {
        return instrumento;
    }
}
