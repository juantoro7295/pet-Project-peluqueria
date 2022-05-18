package co.com.salondebelleza.belleza.reservacion;

import co.com.salondebelleza.belleza.reservacion.entity.Cliente;
import co.com.salondebelleza.belleza.reservacion.entity.TipoServicio;
import co.com.salondebelleza.belleza.reservacion.events.ReservacionAgregada;
import co.com.salondebelleza.belleza.reservacion.values.ReservacionId;
import co.com.sofka.domain.generic.AggregateEvent;

/**
 * Agregado Reservacion
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */


public class Reservacion extends AggregateEvent<ReservacionId> {

    /**
     * Caracteristicas
     */
    protected Cliente cliente;
    protected TipoServicio tipoServicio;

    /**
     * Constructor Reservacion
     *
     * @param entityId     de tipo ReservacionId
     * @param cliente      de tipo Cliente
     * @param tipoServicio de tipo TipoServicio
     */
    public Reservacion(ReservacionId entityId, Cliente cliente, TipoServicio tipoServicio) {
        super(entityId);
        appendChange(new ReservacionAgregada(cliente, tipoServicio)).apply();
        subscribe(new ReservacionEventChange(this));
    }

    /**
     * Constructor Reservacion
     *
     * @param reservacionId de tipo ReservacionId
     */
    public Reservacion(ReservacionId reservacionId) {
        super(reservacionId);
        subscribe(new ReservacionEventChange(this));
    }

    /**
     * getters
     */

    public Cliente Cliente() {
        return cliente;
    }

    public TipoServicio TipoServicio() {
        return tipoServicio;
    }
}
