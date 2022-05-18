package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Fecha;
import co.com.salondebelleza.belleza.reservacion.entity.Cliente;
import co.com.salondebelleza.belleza.reservacion.entity.TipoServicio;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * Evento Reservacion Agregada
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class ReservacionAgregada extends DomainEvent {
    private final Cliente cliente;
    private final TipoServicio tipoServicio;
    private final Fecha fecha;

    /**
     * Constructor ReservacionAgregada
     * @param cliente
     * @param tipoServicio
     * @param fecha
     */
    public ReservacionAgregada(Cliente cliente, TipoServicio tipoServicio, Fecha fecha) {
        super("co.com.salondebelleza.belleza.ReservacionAgregada");
        this.cliente = cliente;
        this.tipoServicio = tipoServicio;
        this.fecha = fecha;
    }

    /**
     * Obtener Cliente
     * @return
     */
    public Cliente Cliente() {
        return cliente;
    }

    /**
     * Obtener Tipo de Servicio
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
