package co.com.salondebelleza.belleza.puestodetrabajo;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
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
}
