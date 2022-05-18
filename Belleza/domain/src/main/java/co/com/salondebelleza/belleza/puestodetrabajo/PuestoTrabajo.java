package co.com.salondebelleza.belleza.puestodetrabajo;

import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.salondebelleza.belleza.puestodetrabajo.entity.Instrumento;
import co.com.salondebelleza.belleza.puestodetrabajo.entity.Producto;
import co.com.salondebelleza.belleza.puestodetrabajo.events.PuestoDeTrabajoAgregado;
import co.com.salondebelleza.belleza.puestodetrabajo.values.PuestoTrabajoId;
import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

/**
 * Agregado Puesto de trabajo
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */


public class PuestoTrabajo extends AggregateEvent<PuestoTrabajoId> {

    /**
     * Caracteristicas
     */

    protected List<Producto> producto;
    protected Instrumento instrumento;
    protected EmpleadoId empleadoId;
    protected ReservacionId reservacionId;


    /**
     *  Constructor PuestoTrabajo
     * @param entityId de tipo EntidadId
     * @param empleadoId de tipo EmpleadoId
     * @param reservacionId de tipo ReservacionId
     * @param instrumento de tipo Instrumento
     */
    public PuestoTrabajo(PuestoTrabajoId entityId, EmpleadoId empleadoId, ReservacionId reservacionId, Instrumento instrumento) {
        super(entityId);
        appendChange(new PuestoDeTrabajoAgregado(empleadoId, reservacionId, instrumento)).apply();
        subscribe(new PuestoTrabajoEventChange(this));


    }

    /**
     * Constructor
     * @param entityId
     */
    public PuestoTrabajo(PuestoTrabajoId entityId) {
        super(entityId);
        subscribe(new PuestoTrabajoEventChange(this));
    }


    /**
     * getters
     */

    public List<Producto> Producto() {
        return producto;
    }

    public Instrumento Instrumento() {
        return instrumento;
    }

    public EmpleadoId EmpleadoId() {
        return empleadoId;
    }

    public ReservacionId ReservacionId() {
        return reservacionId;
    }
}
