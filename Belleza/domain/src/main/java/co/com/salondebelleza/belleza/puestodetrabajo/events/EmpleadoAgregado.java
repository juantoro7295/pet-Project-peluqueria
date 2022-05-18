package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.empleado.entity.Contrato;
import co.com.salondebelleza.belleza.empleado.entity.Rol;
import co.com.sofka.domain.generic.DomainEvent;
import generic.values.Nombre;

/**
 * Evento Empleado Agregado
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class EmpleadoAgregado extends DomainEvent {

    private final Contrato contrato;
    private final Nombre nombre;
    private final Rol rol;

    /**
     * Constructor de EmpleadoAgregado
     *
     * @param contrato
     * @param nombre
     * @param rol
     */
    public EmpleadoAgregado(Contrato contrato, Nombre nombre, Rol rol) {
        super("co.com.salondebelleza.belleza.EmpleadoAgregado");
        this.contrato = contrato;
        this.nombre = nombre;
        this.rol = rol;
    }

    /**
     * Metodo de acceso de contrato
     *
     * @return contrato
     */
    public Contrato Contrato() {
        return contrato;
    }

    /**
     * Metodo de acceso Nombre
     *
     * @return nombre
     */

    public Nombre Nombre() {
        return nombre;
    }

    /**
     * Metodo de acceso rol
     *
     * @return rol
     */
    public Rol Rol() {
        return rol;
    }
}
