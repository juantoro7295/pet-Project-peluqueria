package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;


/**
 * Evento Producto eliminado
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class ProductoEliminado extends DomainEvent {
    private final ProductoId productoId;

    /**
     * Constructor del ProductoEliminado
     * @param productoId
     */
    public ProductoEliminado(ProductoId productoId) {
        super("co.com.salondebelleza.belleza.ProductoEliminado");
        this.productoId = productoId;
    }

    /**
     * Metodo de acceso de productoId
     * @return productoId
     */
    public ProductoId ProductoId() {
        return productoId;
    }
}
