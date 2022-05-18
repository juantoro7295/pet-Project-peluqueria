package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.ProductoId;
import co.com.sofka.domain.generic.Command;

/**
 * Comando Eliminar Producto
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class EliminarProducto extends Command {
    private final ProductoId productoId;

    /**
     * Constructor EliminarProducto
     * @param productoId
     */
    public EliminarProducto(ProductoId productoId) {
        this.productoId = productoId;
    }

    /**
     * Obtener ProductoId
     * @return
     */
    public ProductoId ProductoId() {
        return productoId;
    }
}
