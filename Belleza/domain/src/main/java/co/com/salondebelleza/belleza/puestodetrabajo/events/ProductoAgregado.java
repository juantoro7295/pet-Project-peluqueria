package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.sofka.domain.generic.DomainEvent;
import generic.values.Nombre;

public class ProductoAgregado extends DomainEvent {
    private final Nombre nombre;
    private final Categoria categoria;

    public ProductoAgregado( Nombre nombre, Categoria categoria) {
        super("co.com.salondebelleza.belleza.ProductoAgregado");
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Categoria Categoria() {
        return categoria;
    }
}
