package co.com.salondebelleza.belleza.empleado;

import co.com.sofka.domain.generic.AggregateEvent;

public class Empleado extends AggregateEvent<EmpleadoId> {

    public Empleado(EmpleadoId empleadoId) {
        super(empleadoId);
    }
}
