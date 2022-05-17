package co.com.salondebelleza.belleza.empleado;

import co.com.salondebelleza.belleza.empleado.events.EmpleadoAgregado;
import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.sofka.domain.generic.AggregateEvent;
import generic.values.Nombre;

public class Empleado extends AggregateEvent<EmpleadoId> {

    protected Nombre nombre;
    protected Contrato contrato;
    protected Rol rol;

    public Empleado(EmpleadoId entityId, Nombre nombre, Contrato contrato, Rol rol) {
        super(entityId);
        appendChange(new EmpleadoAgregado(nombre,contrato,rol)).apply();
        subscribe(new EmpleadoEventChange(this));


    }


    public Empleado(EmpleadoId empleadoId) {

        super(empleadoId);
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Contrato Contrato() {
        return contrato;
    }

    public Rol Rol() {
        return rol;
    }
}
