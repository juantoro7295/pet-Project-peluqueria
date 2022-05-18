package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.sofka.domain.generic.Command;

public class EliminarEmpleado extends Command {

    private final EmpleadoId empleadoId;

    public EliminarEmpleado(EmpleadoId empleadoId) {
        this.empleadoId = empleadoId;
    }

}
