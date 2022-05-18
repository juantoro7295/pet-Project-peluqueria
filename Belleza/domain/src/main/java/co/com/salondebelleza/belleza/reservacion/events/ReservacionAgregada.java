package co.com.salondebelleza.belleza.reservacion.events;

import co.com.salondebelleza.belleza.reservacion.entity.Cliente;
import co.com.salondebelleza.belleza.reservacion.entity.TipoServicio;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * Evento Reservacion Agregada
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class ReservacionAgregada extends DomainEvent {

    /**
     * Caracteristicas
     */

    private final Cliente cliente;
    private final TipoServicio tipoServicio;

    /**
     * Constructor Reservacion Agregado
     *
     * @param cliente      de tipo cliente
     * @param tipoServicio de tipo TipoServicio
     */

    public ReservacionAgregada(Cliente cliente, TipoServicio tipoServicio) {
        super("co.com.salondebelleza.belleza.ReservacionAgregada");
        this.cliente = cliente;
        this.tipoServicio = tipoServicio;

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
