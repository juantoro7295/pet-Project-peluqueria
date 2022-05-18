package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.InstrumentoId;
import co.com.sofka.domain.generic.Command;

public class EliminarInstrumento extends Command {
    private final InstrumentoId instrumentoId;

    public EliminarInstrumento(InstrumentoId instrumentoId) {
        this.instrumentoId = instrumentoId;
    }

    public InstrumentoId InstrumentoId() {
        return instrumentoId;
    }
}
