package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.empleado.entity.Contrato;
import co.com.salondebelleza.belleza.empleado.entity.Rol;
import co.com.sofka.domain.generic.DomainEvent;
import generic.values.Nombre;

public class EmpleadoAgregado extends DomainEvent {

    private final Contrato contrato;
    private final Nombre nombre;
    private final Rol rol;

    public EmpleadoAgregado( Contrato contrato, Nombre nombre, Rol rol) {
        super("co.com.salondebelleza.belleza.EmpleadoAgregado");
        this.contrato = contrato;
        this.nombre = nombre;
        this.rol = rol;
    }
}
