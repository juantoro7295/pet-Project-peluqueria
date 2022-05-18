package co.com.salondebelleza.belleza.reservacion.commands;

import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.Command;

/**
 * Comando Eliminar Reservacion
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class EliminarReservacion extends Command {

    /**
     * Caracteristicas
     */

    private final ReservacionId reservacionId;

    /**
     * Constructor Eliminar ReservacionId
     *
     * @param reservacionId de tipo ReservacionId
     */

    public EliminarReservacion(ReservacionId reservacionId) {
        this.reservacionId = reservacionId;
    }

    /**
     * getters
     */

    public ReservacionId ReservacionId() {
        return reservacionId;
    }
}
