package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.empleado.entity.Contrato;
import co.com.salondebelleza.belleza.empleado.entity.Rol;
import co.com.salondebelleza.belleza.puestodetrabajo.values.PuestoTrabajoId;
import co.com.sofka.domain.generic.Command;
import generic.values.Nombre;


/**
 * Comando Agregar Empleado
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class AgregarEmpleado extends Command {
    private final PuestoTrabajoId puestoTrabajoId;
    private final Contrato contrato;
    private final Nombre nombre;
    private final Rol rol;

    /**
     * Constructor AgregarEmpleado
     *
     * @param puestoTrabajoId
     * @param contrato
     * @param nombre
     * @param rol
     */
    public AgregarEmpleado(PuestoTrabajoId puestoTrabajoId, Contrato contrato, Nombre nombre, Rol rol) {
        this.puestoTrabajoId = puestoTrabajoId;
        this.contrato = contrato;
        this.nombre = nombre;
        this.rol = rol;
    }

    /**
     * Obtener Puesto de Trabajo Id
     *
     * @return PuestoTrabajoId
     */
    public PuestoTrabajoId puestoTrabajoId() {
        return puestoTrabajoId;
    }

    /**
     * Obtener Contrato
     *
     * @return Contrato
     */
    public Contrato contrato() {
        return contrato;
    }

    /**
     * Obtener Nombre
     *
     * @return Nombre
     */
    public Nombre nombre() {
        return nombre;
    }

    /**
     * Obtener Rol
     *
     * @return Rol
     */
    public Rol rol() {
        return rol;
    }
}
