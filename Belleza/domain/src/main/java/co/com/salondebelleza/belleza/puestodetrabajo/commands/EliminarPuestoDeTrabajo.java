package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.PuestoTrabajoId;
import co.com.sofka.domain.generic.Command;

/**
 * Comando Eliminar Puesto de Trabajo
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class EliminarPuestoDeTrabajo extends Command {
    private final PuestoTrabajoId puestoTrabajoId;

    /**
     * Constructor EliminarPuestoDeTrabajo
     *
     * @param puestoTrabajoId
     */
    public EliminarPuestoDeTrabajo(PuestoTrabajoId puestoTrabajoId) {
        this.puestoTrabajoId = puestoTrabajoId;
    }

    /**
     * Obtener Puesto de Trabajo Id
     *
     * @return PuestoTrabajoId
     */
    public PuestoTrabajoId PuestoTrabajoId() {
        return puestoTrabajoId;
    }
}
