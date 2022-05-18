package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.salondebelleza.belleza.puestodetrabajo.values.ProductoId;
import co.com.sofka.domain.generic.Command;
import generic.values.Nombre;

/**
 * Comando Agregar Producto
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class AgregarProducto extends Command {
    private final ProductoId productoId;
    private final Nombre nombre;
    private final Categoria categoria;

    /**
     * Constructor AgregarProducto
     *
     * @param productoId
     * @param nombre
     * @param categoria
     */
    public AgregarProducto(ProductoId productoId, Nombre nombre, Categoria categoria) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    /**
     * Obtener Producto Id
     *
     * @return ProductoId
     */
    public ProductoId ProductoId() {
        return productoId;
    }

    /**
     * Obtener Nombre
     *
     * @return Nombre
     */
    public Nombre Nombre() {
        return nombre;
    }

    /**
     * Obtener Categoria
     *
     * @return Categoria
     */
    public Categoria Categoria() {
        return categoria;
    }
}
