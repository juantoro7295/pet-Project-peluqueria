package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.sofka.domain.generic.Command;

/**
 * Comando Eliminar Empleado
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class EliminarEmpleado extends Command {

    private final EmpleadoId empleadoId;

    /**
     * Constructor EliminarEmpleado
     * @param empleadoId
     */
    public EliminarEmpleado(EmpleadoId empleadoId) {
        this.empleadoId = empleadoId;
    }

    /**
     * Obtener Empleado Id
     * @return EmpleadoId
     */
    public EmpleadoId EmpleadoId() {
        return empleadoId;
    }
}
