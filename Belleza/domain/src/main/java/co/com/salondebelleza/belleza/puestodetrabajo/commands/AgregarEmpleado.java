package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.empleado.entity.Contrato;
import co.com.salondebelleza.belleza.empleado.entity.Rol;
import co.com.salondebelleza.belleza.puestodetrabajo.values.PuestoTrabajoId;
import co.com.sofka.domain.generic.Command;
import generic.values.Nombre;

public class AgregarEmpleado extends Command {
    private final PuestoTrabajoId puestoTrabajoId;
    private final Contrato contrato;
    private final Nombre nombre;
    private final Rol rol;

    public AgregarEmpleado(PuestoTrabajoId puestoTrabajoId, Contrato contrato, Nombre nombre, Rol rol) {
        this.puestoTrabajoId = puestoTrabajoId;
        this.contrato = contrato;
        this.nombre = nombre;
        this.rol = rol;
    }

    public PuestoTrabajoId puestoTrabajoId() {
        return puestoTrabajoId;
    }

    public Contrato contrato() {
        return contrato;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Rol rol() {
        return rol;
    }
}
