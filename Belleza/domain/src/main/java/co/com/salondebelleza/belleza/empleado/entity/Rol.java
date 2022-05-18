package co.com.salondebelleza.belleza.empleado.entity;

import co.com.salondebelleza.belleza.empleado.values.NombreRol;
import co.com.salondebelleza.belleza.empleado.values.RolId;
import co.com.sofka.domain.generic.Entity;

/**
 * Entidad Rol
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class Rol extends Entity<RolId> {

    protected NombreRol nombreRol;

    /**
     * Constructor de Rol
     *
     * @param entityId
     * @param nombreRol
     */
    public Rol(RolId entityId, NombreRol nombreRol) {
        super(entityId);
        this.nombreRol = nombreRol;
    }

    /**
     * Constructor de Rol
     *
     * @param entityId
     */
    public Rol(RolId entityId) {
        super(entityId);
    }

    /**
     * Metodo para agregar un rol
     *
     * @param nombreRol
     */
    public void agregarRol(String nombreRol) {
        this.nombreRol = new NombreRol(nombreRol);
    }
}
