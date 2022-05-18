package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * Evento Reservacion Eliminada
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class ReservacionEliminada extends DomainEvent {
    /**
     * Caracteristicas
     */
    private final ReservacionId reservacionId;

    /**
     * Constructor
     *
     * @param reservacionId de tipo ReservacionId
     */

    public ReservacionEliminada(ReservacionId reservacionId) {
        super("co.com.salondebelleza.belleza.ReservacionEliminada");
        this.reservacionId = reservacionId;
    }

    /**
     * getter
     */

    public ReservacionId ReservacionId() {
        return reservacionId;
    }
}
