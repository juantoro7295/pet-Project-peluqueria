package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.InstrumentoId;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * Evento Instrumento Eliminado
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class InstrumentoEliminado extends DomainEvent {
    private final InstrumentoId instrumentoId;

    /**
     * Constructor de IntrumentoEliminado
     *
     * @param instrumentoId
     */
    public InstrumentoEliminado(InstrumentoId instrumentoId) {
        super("co.com.salondebelleza.belleza.InstrumentoEliminado");
        this.instrumentoId = instrumentoId;
    }

    /**
     * Metodo de acceso de introdumentoId
     *
     * @return intrumentoId
     */
    public InstrumentoId getInstrumentoId() {
        return instrumentoId;
    }
}
