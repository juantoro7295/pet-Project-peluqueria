package co.com.salondebelleza.belleza.empleado.events;

import co.com.salondebelleza.belleza.empleado.Contrato;
import co.com.salondebelleza.belleza.empleado.Rol;
import co.com.sofka.domain.generic.DomainEvent;
import generic.values.Nombre;

public class EmpleadoAgregado extends DomainEvent {
    private final Nombre nombre;
    private final Contrato contrato;
    private final Rol rol;

    public EmpleadoAgregado(Nombre nombre, Contrato contrato, Rol rol) {
        super("co.com.salondebelleza.belleza.EmpleadoAgregado");
        this.nombre = nombre;
        this.contrato = contrato;
        this.rol = rol;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Rol getRol() {
        return rol;
    }
}
