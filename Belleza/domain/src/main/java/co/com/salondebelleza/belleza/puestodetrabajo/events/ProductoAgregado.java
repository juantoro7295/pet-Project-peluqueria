package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.sofka.domain.generic.DomainEvent;
import generic.values.Nombre;

/**
 * Evento Producto Agregado
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class ProductoAgregado extends DomainEvent {
    private final Nombre nombre;
    private final Categoria categoria;

    /**
     * Constructor de ProductoAgregado
     * @param nombre
     * @param categoria
     */
    public ProductoAgregado(Nombre nombre, Categoria categoria) {
        super("co.com.salondebelleza.belleza.ProductoAgregado");
        this.nombre = nombre;
        this.categoria = categoria;
    }

    /**
     * Metodo de acceso de nombre
     * @return nombre
     */
    public Nombre Nombre() {
        return nombre;
    }

    /**
     * Metodo de acceso de  categoria
     * @return categoria
     */
    public Categoria Categoria() {
        return categoria;
    }
}
