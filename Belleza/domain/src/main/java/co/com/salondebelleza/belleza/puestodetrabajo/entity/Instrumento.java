package co.com.salondebelleza.belleza.puestodetrabajo.entity;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.salondebelleza.belleza.puestodetrabajo.values.InstrumentoId;
import co.com.sofka.domain.generic.Entity;
import generic.values.Nombre;

public class Instrumento extends Entity<InstrumentoId> {

    protected Nombre nombre;
    protected Categoria categoria;

    public Instrumento(InstrumentoId id, Nombre nombre, Categoria categoria) {
        super(id);
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public Instrumento(InstrumentoId id) {
        super(id);
    }

    public void crearNombre(String nombre){
        this.nombre = new Nombre(nombre);
    }

    public void asignarCategoria(String categoria){
        this.categoria = new Categoria(categoria);
    }
}
