package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Fecha;
import co.com.salondebelleza.belleza.puestodetrabajo.values.PuestoTrabajoId;
import co.com.salondebelleza.belleza.reservacion.entity.Cliente;
import co.com.salondebelleza.belleza.reservacion.entity.TipoServicio;
import co.com.sofka.domain.generic.Command;

/**
 * Comando Agregar Reservacion
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class AgregarReservacion extends Command {
    private final PuestoTrabajoId puestoTrabajoId;
    private final Cliente cliente;
    private final TipoServicio tipoServicio;
    private final Fecha fecha;

    /**
     * Constructor AgregarReservacion
     *
     * @param puestoTrabajoId
     * @param cliente
     * @param tipoServicio
     * @param fecha
     */
    public AgregarReservacion(PuestoTrabajoId puestoTrabajoId, Cliente cliente, TipoServicio tipoServicio, Fecha fecha) {
        this.puestoTrabajoId = puestoTrabajoId;
        this.cliente = cliente;
        this.tipoServicio = tipoServicio;
        this.fecha = fecha;
    }


    /**
     * Obtener Puerto de Trabajo Id
     *
     * @return PuestoTrabajoId
     */
    public PuestoTrabajoId PuestoTrabajoId() {
        return puestoTrabajoId;
    }

    /**
     * Obtener Cliente
     *
     * @return Cliente
     */
    public Cliente Cliente() {
        return cliente;
    }

    /**
     * Obtener Tipo de Servicio
     *
     * @return TipoServicio
     */
    public TipoServicio TipoServicio() {
        return tipoServicio;
    }

    /**
     * Obtener Fecha
     * @return Fecha
     */
    public Fecha Fecha() {
        return fecha;
    }
}
