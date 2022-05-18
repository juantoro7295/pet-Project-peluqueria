package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.salondebelleza.belleza.puestodetrabajo.values.InstrumentoId;
import co.com.sofka.domain.generic.Command;
import generic.values.Nombre;

/**
 * Comando Agregar Instrumento
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */


public class AgregarInstrumento extends Command {

    private final InstrumentoId instrumentoId;
    private final Nombre nombre;
    private final Categoria categoria;

    /**
     * Constructor AgregarInstrumento
     *
     * @param instrumentoId
     * @param nombre
     * @param categoria
     */
    public AgregarInstrumento(InstrumentoId instrumentoId, Nombre nombre, Categoria categoria) {
        this.instrumentoId = instrumentoId;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    /**
     * Obtener Instrumento Id
     *
     * @return InstrumentoId
     */
    public InstrumentoId InstrumentoId() {
        return instrumentoId;
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
