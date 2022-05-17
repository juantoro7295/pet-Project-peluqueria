package co.com.salondebelleza.belleza.empleado;

import co.com.salondebelleza.belleza.empleado.events.EmpleadoAgregado;
import co.com.sofka.domain.generic.EventChange;

public class EmpleadoEventChange extends EventChange {
    public EmpleadoEventChange(Empleado empleado) {
        apply((EmpleadoAgregado event)->{
            empleado.nombre = event.getNombre();
            empleado.contrato = event.getContrato();
            empleado.rol = event.getRol();
        });
    }
}
