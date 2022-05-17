package co.com.salondebelleza.belleza.reservacion;


import co.com.salondebelleza.belleza.reservacion.values.Telefono;
import co.com.sofka.domain.generic.Entity;

import generic.values.Nombre;

public class Cliente extends Entity<ClienteId> {

    protected Nombre nombre;
    protected Telefono telefono;

    public Cliente(ClienteId clienteId) {
        super(clienteId);
    }

    
}
