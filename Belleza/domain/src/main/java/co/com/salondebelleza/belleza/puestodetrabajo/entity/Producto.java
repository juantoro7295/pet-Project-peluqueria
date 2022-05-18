package co.com.salondebelleza.belleza.puestodetrabajo.entity;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.salondebelleza.belleza.puestodetrabajo.values.ProductoId;
import co.com.sofka.domain.generic.Entity;
import generic.values.Nombre;

/**
 * Entidad Producto
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class Producto extends Entity<ProductoId> {

    protected Nombre nombre;
    protected Categoria categoria;

    /**
     * Constructor Producto
     *
     * @param id
     * @param nombre
     * @param categoria
     */
    public Producto(ProductoId id, Nombre nombre, Categoria categoria) {
        super(id);
        this.nombre = nombre;
        this.categoria = categoria;
    }

    /**
     * Constructor Producto
     *
     * @param id
     */
    public Producto(ProductoId id) {
        super(id);
    }

    /**
     * Crear Producto
     *
     * @param nombre
     * @param categoria
     */
    public void crearProducto(String nombre, String categoria) {
        this.nombre = new Nombre(nombre);
        this.categoria = new Categoria(categoria);
    }

    /**
     * Metodo para ctualizar Categoria
     *
     * @param categoria
     */
    public void actualizarCategoria(String categoria) {
        this.categoria = new Categoria(categoria);
    }

    /**
     * Metodo para actualizar Nombre
     *
     * @param nombre
     */
    public void actualizarNombre(String nombre) {
        this.nombre = new Nombre(nombre);
    }
}
