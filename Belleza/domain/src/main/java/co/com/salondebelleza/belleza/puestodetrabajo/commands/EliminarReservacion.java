package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.Command;

/**
 * Comando Eliminar Reservacion
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class EliminarReservacion extends Command {
    private final ReservacionId reservacionId;

    /**
     * Constructor EliminarReservacion
     *
     * @param reservacionId
     */
    public EliminarReservacion(ReservacionId reservacionId) {
        this.reservacionId = reservacionId;
    }

    /**
     * Obtener Reservacion Id
     *
     * @return ReservacionId
     */
    public ReservacionId ReservacionId() {
        return reservacionId;
    }
}
