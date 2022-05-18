package co.com.salondebelleza.belleza.puestodetrabajo.entity;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.salondebelleza.belleza.puestodetrabajo.values.InstrumentoId;
import co.com.sofka.domain.generic.Entity;
import generic.values.Nombre;

/**
 * Entidad Instrumento
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class Instrumento extends Entity<InstrumentoId> {

    protected Nombre nombre;
    protected Categoria categoria;

    /**
     * Constructor de Instrumento
     *
     * @param id
     * @param nombre
     * @param categoria
     */
    public Instrumento(InstrumentoId id, Nombre nombre, Categoria categoria) {
        super(id);
        this.nombre = nombre;
        this.categoria = categoria;
    }

    /**
     * Constructor de instrumento
     *
     * @param id
     */
    public Instrumento(InstrumentoId id) {
        super(id);
    }

    /**
     * Metodo para crearNombre
     *
     * @param nombre
     */
    public void crearNombre(String nombre) {
        this.nombre = new Nombre(nombre);
    }

    /**
     * Metodo para asignarCategoria
     *
     * @param categoria
     */
    public void asignarCategoria(String categoria) {
        this.categoria = new Categoria(categoria);
    }
}
