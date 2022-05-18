package co.com.salondebelleza.belleza.empleado.entity;

import co.com.salondebelleza.belleza.empleado.values.NombreRol;
import co.com.salondebelleza.belleza.empleado.values.RolId;
import co.com.sofka.domain.generic.Entity;

public class Rol extends Entity<RolId> {

    protected NombreRol nombreRol;

    public Rol(RolId entityId, NombreRol nombreRol) {
        super(entityId);
        this.nombreRol = nombreRol;
    }

    public Rol(RolId entityId) {
        super(entityId);
    }

    public void agregarRol(String nombreRol){
        this.nombreRol = new NombreRol(nombreRol);
    }
}
