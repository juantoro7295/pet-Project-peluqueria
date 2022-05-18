package co.com.salondebelleza.belleza.empleado.commands;

import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.salondebelleza.belleza.empleado.values.TipoContrato;
import co.com.sofka.domain.generic.Command;


/**
 * Comando Agregar contrato
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */


public class AgregarContrato extends Command {

    private final EmpleadoId empleadoId;
    private final TipoContrato tipoContrato;

    /**
     * Constructor AgregarContrato
     *
     * @param empleadoId
     * @param tipoContrato
     */
    public AgregarContrato(EmpleadoId empleadoId, TipoContrato tipoContrato) {
        this.empleadoId = empleadoId;
        this.tipoContrato = tipoContrato;
    }

    /**
     * Metodo de acceso empleadoId
     *
     * @return empleadoId
     */
    public EmpleadoId EmpleadoId() {
        return empleadoId;
    }

    /**
     * Metodo de acceso tipoContrato
     *
     * @return tipoContrato
     */

    public TipoContrato TipoContrato() {
        return tipoContrato;
    }
}
