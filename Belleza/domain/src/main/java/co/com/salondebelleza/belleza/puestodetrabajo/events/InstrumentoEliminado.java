package co.com.salondebelleza.belleza.puestodetrabajo.events;

import co.com.salondebelleza.belleza.puestodetrabajo.values.InstrumentoId;
import co.com.sofka.domain.generic.DomainEvent;

public class InstrumentoEliminado extends DomainEvent {
    private final InstrumentoId instrumentoId;

    public InstrumentoEliminado(InstrumentoId instrumentoId) {
        super("co.com.salondebelleza.belleza.InstrumentoEliminado");
        this.instrumentoId = instrumentoId;
    }

    public InstrumentoId getInstrumentoId() {
        return instrumentoId;
    }
}
