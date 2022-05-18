package co.com.salondebelleza.belleza.reservacion.entity;


import co.com.salondebelleza.belleza.reservacion.values.ClienteId;
import co.com.salondebelleza.belleza.reservacion.values.Telefono;
import co.com.sofka.domain.generic.Entity;

import generic.values.Nombre;

/**
 * Entidad Cliente
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class Cliente extends Entity<ClienteId> {

    /**
     * Caracteristicas
     */

    protected Nombre nombre;
    protected Telefono telefono;

    /**
     * Constructor Cliente
     *
     * @param clienteId de tipo ClienteId
     * @param nombre    de tipo Nombre
     * @param telefono  de tipo Telefono
     */

    public Cliente(ClienteId clienteId, Nombre nombre, Telefono telefono) {
        super(clienteId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Metodo crearCliente
     *
     * @param nombre   de tipo Nombre
     * @param telefono de tipo Telefono
     */

    public void crearCliente(Nombre nombre, Telefono telefono) {
        var clienteid = new ClienteId();
        Cliente cliente = new Cliente(clienteid, nombre, telefono);
    }

}
