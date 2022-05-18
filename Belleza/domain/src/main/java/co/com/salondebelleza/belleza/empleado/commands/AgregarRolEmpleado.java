package co.com.salondebelleza.belleza.empleado.commands;

import co.com.salondebelleza.belleza.empleado.entity.Contrato;
import co.com.salondebelleza.belleza.empleado.entity.Rol;
import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.sofka.domain.generic.Command;
import generic.values.Nombre;

/**
 * Comando Agregar Rol al Empleado
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class AgregarRolEmpleado extends Command {

    private final EmpleadoId empleadoId;
    private final Contrato contrato;
    private final Nombre nombre;
    private final Rol rol;

    /**
     * Constructor AgregarRolEmpleado
     *
     * @param empleadoId
     * @param contrato
     * @param nombre
     * @param rol
     */
    public AgregarRolEmpleado(EmpleadoId empleadoId, Contrato contrato, Nombre nombre, Rol rol) {
        this.empleadoId = empleadoId;
        this.contrato = contrato;
        this.nombre = nombre;
        this.rol = rol;
    }

    /**
     * Obtener el id del Empleado
     *
     * @return id del Empleado
     */
    public EmpleadoId EmpleadoId() {
        return empleadoId;
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
     * Obtener Nombre
     *
     * @return Nombre
     */
    public Nombre Nombre() {
        return nombre;
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
