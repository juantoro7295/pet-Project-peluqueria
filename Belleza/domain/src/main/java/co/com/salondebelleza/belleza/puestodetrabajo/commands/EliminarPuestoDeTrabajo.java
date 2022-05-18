package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.PuestoTrabajoId;
import co.com.sofka.domain.generic.Command;

public class EliminarPuestoDeTrabajo extends Command {
    private final PuestoTrabajoId puestoTrabajoId;

    public EliminarPuestoDeTrabajo(PuestoTrabajoId puestoTrabajoId) {
        this.puestoTrabajoId = puestoTrabajoId;
    }

    public PuestoTrabajoId PuestoTrabajoId() {
        return puestoTrabajoId;
    }
}
