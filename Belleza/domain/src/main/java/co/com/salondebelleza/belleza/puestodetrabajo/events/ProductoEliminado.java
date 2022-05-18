package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoEliminado extends DomainEvent {
    private final ProductoId productoId;

    public ProductoEliminado( ProductoId productoId) {
        super("co.com.salondebelleza.belleza.ProductoEliminado");
        this.productoId = productoId;
    }

    public ProductoId ProductoId() {
        return productoId;
    }
}
