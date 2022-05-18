package co.com.salondebelleza.belleza.reservacion.entity;


import co.com.salondebelleza.belleza.reservacion.values.ClienteId;
import co.com.salondebelleza.belleza.reservacion.values.Telefono;
import co.com.sofka.domain.generic.Entity;

import generic.values.Nombre;

public class Cliente extends Entity<ClienteId> {

    protected  Nombre nombre;
    protected  Telefono telefono;

    public Cliente(ClienteId clienteId, Nombre nombre, Telefono telefono) {
        super(clienteId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void crearCliente(Nombre nombre, Telefono telefono){
        var clienteid = new ClienteId();
        Cliente cliente = new Cliente(clienteid,nombre,telefono);
    }

}
