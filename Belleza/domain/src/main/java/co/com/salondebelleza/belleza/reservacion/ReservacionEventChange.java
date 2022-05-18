package co.com.salondebelleza.belleza.reservacion;

import co.com.salondebelleza.belleza.reservacion.events.ReservacionAgregada;
import co.com.sofka.domain.generic.EventChange;

public class ReservacionEventChange extends EventChange {
    public ReservacionEventChange(Reservacion reservacion) {
        apply((ReservacionAgregada event) -> {
            reservacion.cliente = event.Cliente();
            reservacion.tipoServicio = event.TipoServicio();
        });
    }
}
