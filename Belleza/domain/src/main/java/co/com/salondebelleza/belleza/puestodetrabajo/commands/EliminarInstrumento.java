package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.InstrumentoId;
import co.com.sofka.domain.generic.Command;

/**
 * Comando Eliminar Instrumento
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class EliminarInstrumento extends Command {
    private final InstrumentoId instrumentoId;

    /**
     * Constructor EliminarInstrumento
     * @param instrumentoId
     */
    public EliminarInstrumento(InstrumentoId instrumentoId) {
        this.instrumentoId = instrumentoId;
    }

    /**
     * Obtener Instrumento Id
     * @return InstrumentoId
     */
    public InstrumentoId InstrumentoId() {
        return instrumentoId;
    }
}
