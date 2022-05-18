package co.com.salondebelleza.belleza.empleado;

import co.com.salondebelleza.belleza.empleado.entity.Contrato;
import co.com.salondebelleza.belleza.empleado.entity.Rol;
import co.com.salondebelleza.belleza.empleado.events.EmpleadoAgregado;
import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.sofka.domain.generic.AggregateEvent;
import generic.values.Nombre;


/**
 * Agregado Empleado
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class Empleado extends AggregateEvent<EmpleadoId> {

    protected Nombre nombre;
    protected Contrato contrato;
    protected Rol rol;

    /**
     * Constructor Empleado
     *
     * @param entityId
     * @param nombre
     * @param contrato
     * @param rol
     */
    public Empleado(EmpleadoId entityId, Nombre nombre, Contrato contrato, Rol rol) {
        super(entityId);
        appendChange(new EmpleadoAgregado(nombre, contrato, rol)).apply();
        subscribe(new EmpleadoEventChange(this));
    }


    /**
     * Constructor Empleado
     *
     * @param empleadoId
     */
    public Empleado(EmpleadoId empleadoId) {
        super(empleadoId);
        subscribe(new EmpleadoEventChange(this));
    }

    /**
     * Obtener Nombre
     *
     * @return Nombre
     */
    public Nombre Nombre() {
        return nombre;
    }

    /**
     * Obtener Contrato
     *
     * @return Contrato
     */
    public Contrato Contrato() {
        return contrato;
    }

    /**
     * Obtener Rol
     *
     * @return Rol
     */
    public Rol Rol() {
        return rol;
    }
}
