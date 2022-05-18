package co.com.salondebelleza.belleza.puestodetrabajo;

import co.com.salondebelleza.belleza.puestodetrabajo.events.PuestoDeTrabajoAgregado;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;

public class PuestoTrabajoEventChange extends EventChange {
    public PuestoTrabajoEventChange(PuestoTrabajo puestoTrabajo) {
        apply((PuestoDeTrabajoAgregado event) -> {
            puestoTrabajo.empleadoId = event.EmpleadoId();
            puestoTrabajo.instrumento = event.Instrumento();
            puestoTrabajo.reservacionId = event.ReservacionId();
            puestoTrabajo.producto = new ArrayList<>();
        });

    }
}
