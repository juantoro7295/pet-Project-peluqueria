package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.sofka.domain.generic.DomainEvent;
import generic.values.Nombre;

/**
 * Evento Instrumento Agregado
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class InstrumentoAgregado extends DomainEvent {
    private final Nombre nombre;
    private final Categoria categoria;

    /**
     * Constructor para IntrumentoAgregado
     * @param nombre
     * @param categoria
     */
    public InstrumentoAgregado(Nombre nombre, Categoria categoria) {
        super("co.com.salondebelleza.belleza.InstrumentoAgregado");
        this.nombre = nombre;
        this.categoria = categoria;
    }

    /**
     * Metodo de acceso Nombre
     * @return nombre
     */
    public Nombre Nombre() {
        return nombre;
    }

    /**
     * Metoodo de acceso de categoria
     * @return categoria
     */
    public Categoria Categoria() {
        return categoria;
    }
}
