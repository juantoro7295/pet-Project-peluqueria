package co.com.salondebelleza.belleza.puestodetrabajo.commands;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.salondebelleza.belleza.puestodetrabajo.values.InstrumentoId;
import co.com.sofka.domain.generic.Command;
import generic.values.Nombre;

public class AgregarInstrumento extends Command {

    private final InstrumentoId instrumentoId;
    private final Nombre nombre;
    private final Categoria categoria;

    public AgregarInstrumento(InstrumentoId instrumentoId, Nombre nombre, Categoria categoria) {
        this.instrumentoId = instrumentoId;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public InstrumentoId InstrumentoId() {
        return instrumentoId;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Categoria Categoria() {
        return categoria;
    }
}
