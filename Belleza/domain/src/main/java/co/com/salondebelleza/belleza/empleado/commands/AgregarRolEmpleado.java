package co.com.salondebelleza.belleza.empleado.commands;

import co.com.salondebelleza.belleza.empleado.entity.Contrato;
import co.com.salondebelleza.belleza.empleado.entity.Rol;
import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.sofka.domain.generic.Command;
import generic.values.Nombre;

public class AgregarRolEmpleado extends Command {

    private final EmpleadoId empleadoId;
    private final Contrato contrato;
    private final Nombre nombre;
    private final Rol rol;

    public AgregarRolEmpleado(EmpleadoId empleadoId, Contrato contrato, Nombre nombre, Rol rol) {
        this.empleadoId = empleadoId;
        this.contrato = contrato;
        this.nombre = nombre;
        this.rol = rol;
    }

    public EmpleadoId EmpleadoId() {
        return empleadoId;
    }

    public Contrato Contrato() {
        return contrato;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Rol Rol() {
        return rol;
    }
}
