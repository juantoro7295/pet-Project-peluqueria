package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.empleado.values.EmpleadoId;
import co.com.salondebelleza.belleza.puestodetrabajo.entity.Instrumento;
import co.com.salondebelleza.belleza.puestodetrabajo.entity.Producto;
import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.Command;

import java.util.List;


/**
 * Comando Agregar Puesto de trabajo
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class AgregarPuestoDeTrabajo extends Command {
    private final EmpleadoId empleadoId;
    private final ReservacionId reservacionId;
    private final Instrumento instrumento;
    private final List<Producto> productoList;

    /**
     * Constructor Agregar Puesto de trabajo
     *
     * @param empleadoId
     * @param reservacionId
     * @param instrumento
     * @param productoList
     */
    public AgregarPuestoDeTrabajo(EmpleadoId empleadoId, ReservacionId reservacionId, Instrumento instrumento, List<Producto> productoList) {
        this.empleadoId = empleadoId;
        this.reservacionId = reservacionId;
        this.instrumento = instrumento;
        this.productoList = productoList;
    }

    /**
     * Obtener EmpleadoId
     *
     * @return empleadoId
     */
    public EmpleadoId empleadoId() {
        return empleadoId;
    }

    /**
     * Obtener Reservacionid
     *
     * @return reservacionId
     */
    public ReservacionId reservacionId() {
        return reservacionId;
    }

    /**
     * Obtener Instrumento
     *
     * @return instrumento
     */
    public Instrumento instrumento() {
        return instrumento;
    }

    /**
     * Obtener Lista de poductos
     *
     * @return porductoList
     */
    public List<Producto> productoList() {
        return productoList;
    }
}
