package co.com.salondebelleza.belleza.reservacion.events;

import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * Reservacion Eliminada
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class ReservacionEliminada extends DomainEvent {

    /**
     * caracteristicas
     */
    private final ReservacionId reservacionId;

    /**
     * Constructor Reservacion Eliminada
     *
     * @param reservacionId de tipo ReservacionId
     */

    public ReservacionEliminada(ReservacionId reservacionId) {
        super("co.com.salondebelleza.belleza.ReservacionEliminada");
        this.reservacionId = reservacionId;
    }

    /**
     * getters
     */

    public ReservacionId reservacionId() {
        return reservacionId;
    }
}
