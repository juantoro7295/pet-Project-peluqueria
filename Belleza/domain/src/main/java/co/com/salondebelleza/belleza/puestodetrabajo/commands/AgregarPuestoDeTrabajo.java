package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.salondebelleza.belleza.puestodetrabajo.entity.Instrumento;
import co.com.salondebelleza.belleza.puestodetrabajo.entity.Producto;
import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class AgregarPuestoDeTrabajo extends Command {
    private final EmpleadoId empleadoId;
    private final ReservacionId reservacionId;
    private final Instrumento instrumento;
    private final List<Producto> productoList;

    public AgregarPuestoDeTrabajo(EmpleadoId empleadoId, ReservacionId reservacionId, Instrumento instrumento, List<Producto> productoList) {
        this.empleadoId = empleadoId;
        this.reservacionId = reservacionId;
        this.instrumento = instrumento;
        this.productoList = productoList;
    }

    public EmpleadoId empleadoId() {
        return empleadoId;
    }

    public ReservacionId reservacionId() {
        return reservacionId;
    }

    public Instrumento instrumento() {
        return instrumento;
    }

    public List<Producto> productoList() {
        return productoList;
    }
}
