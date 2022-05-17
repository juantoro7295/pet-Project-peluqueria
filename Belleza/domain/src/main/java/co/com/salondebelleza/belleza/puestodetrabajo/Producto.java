package co.com.salondebelleza.belleza.puestodetrabajo;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.sofka.domain.generic.Entity;
import generic.values.Nombre;

public class Producto extends Entity<ProductoId> {

    protected Nombre nombre;
    protected Categoria categoria;

    public Producto(ProductoId id, Nombre nombre, Categoria categoria) {
        super(id);
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public Producto(ProductoId id) {
        super(id);
    }
}
