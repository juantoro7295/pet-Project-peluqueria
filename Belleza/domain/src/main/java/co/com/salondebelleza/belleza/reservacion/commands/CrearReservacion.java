package co.com.salondebelleza.belleza.reservacion.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Fecha;
import co.com.salondebelleza.belleza.reservacion.entity.Cliente;
import co.com.salondebelleza.belleza.reservacion.entity.TipoServicio;
import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.Command;

/**
 * Comando Crear Reservacion
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class CrearReservacion extends Command {

    /**
     * Caracteristicas
     */

    private final ReservacionId reservacionId;
    private final Cliente cliente;
    private final TipoServicio tipoServicio;
    private final Fecha fecha;

    /**
     * Constructor
     *
     * @param reservacionId de tipo ReservacionId
     * @param cliente       de tipo Cliente
     * @param tipoServicio  de tipo TipoServicio
     * @param fecha         de tipo Fecha
     */

    public CrearReservacion(ReservacionId reservacionId, Cliente cliente, TipoServicio tipoServicio, Fecha fecha) {
        this.reservacionId = reservacionId;
        this.cliente = cliente;
        this.tipoServicio = tipoServicio;
        this.fecha = fecha;
    }

    /**
     * getters
     */

    public ReservacionId ReservacionId() {
        return reservacionId;
    }

    public Cliente Cliente() {
        return cliente;
    }

    public TipoServicio TipoServicio() {
        return tipoServicio;
    }

    public Fecha Fecha() {
        return fecha;
    }
}
