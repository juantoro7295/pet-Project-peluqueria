package co.com.salondebelleza.belleza.empleado.events;

import co.com.salondebelleza.belleza.empleado.entity.Contrato;
import co.com.salondebelleza.belleza.empleado.entity.Rol;
import co.com.sofka.domain.generic.DomainEvent;
import generic.values.Nombre;

/**
 * Evento empleado agregado
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class EmpleadoAgregado extends DomainEvent {
    private final Nombre nombre;
    private final Contrato contrato;
    private final Rol rol;

    /**
     * Constructor EmpleadoAgregado
     *
     * @param nombre
     * @param contrato
     * @param rol
     */
    public EmpleadoAgregado(Nombre nombre, Contrato contrato, Rol rol) {
        super("co.com.salondebelleza.belleza.EmpleadoAgregado");
        this.nombre = nombre;
        this.contrato = contrato;
        this.rol = rol;
    }

    /**
     * Obtener Contrato
     *
     * @return Contrato
     */
    public Contrato getContrato() {
        return contrato;
    }

    /**
     * Obtener Nombre
     *
     * @return Nombre
     */
    public Nombre getNombre() {
        return nombre;
    }

    /**
     * Obtener Rol
     *
     * @return Rol
     */
    public Rol getRol() {
        return rol;
    }
}
