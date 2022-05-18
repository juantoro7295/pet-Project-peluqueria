package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.ProductoId;
import co.com.sofka.domain.generic.Command;

public class EliminarProducto extends Command {
    private final ProductoId productoId;

    public EliminarProducto(ProductoId productoId) {
        this.productoId = productoId;
    }

    public ProductoId ProductoId() {
        return productoId;
    }
}
