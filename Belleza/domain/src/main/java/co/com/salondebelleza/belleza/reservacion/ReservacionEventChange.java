package co.com.salondebelleza.belleza.reservacion;

import co.com.salondebelleza.belleza.reservacion.events.ReservacionAgregada;
import co.com.sofka.domain.generic.EventChange;

/**
 * Evento de cambio en Reservacion
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */


public class ReservacionEventChange extends EventChange {

    /**
     * Evento de cambio Reservacion
     *
     * @param reservacion de tipo Reservacion
     */

    public ReservacionEventChange(Reservacion reservacion) {
        apply((ReservacionAgregada event) -> {
            reservacion.cliente = event.Cliente();
            reservacion.tipoServicio = event.TipoServicio();
        });
    }
}
