package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.salondebelleza.belleza.puestodetrabajo.values.ProductoId;
import co.com.sofka.domain.generic.Command;
import generic.values.Nombre;

public class AgregarProducto extends Command {
    private final ProductoId productoId;
    private final Nombre nombre;
    private final Categoria categoria;

    public AgregarProducto(ProductoId productoId, Nombre nombre, Categoria categoria) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.categoria = categoria;
    }


    public ProductoId ProductoId() {
        return productoId;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Categoria Categoria() {
        return categoria;
    }
}
