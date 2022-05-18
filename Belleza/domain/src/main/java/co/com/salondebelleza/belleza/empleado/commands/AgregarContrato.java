package co.com.salondebelleza.belleza.empleado.commands;

import co.com.salondebelleza.belleza.empleado.entity.Rol;
import co.com.salondebelleza.belleza.empleado.values.ContratoId;
import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.salondebelleza.belleza.empleado.values.TipoContrato;
import co.com.sofka.domain.generic.Command;

public class AgregarContrato extends Command {
    private final EmpleadoId empleadoId;
    private final TipoContrato tipoContrato;

    public AgregarContrato(EmpleadoId empleadoId, TipoContrato tipoContrato) {
        this.empleadoId = empleadoId;
        this.tipoContrato = tipoContrato;
    }

    public EmpleadoId EmpleadoId() {
        return empleadoId;
    }

    public TipoContrato TipoContrato() {
        return tipoContrato;
    }
}
