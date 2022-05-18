package co.com.salondebelleza.belleza.empleado.entity;

import co.com.salondebelleza.belleza.empleado.values.ContratoId;
import co.com.salondebelleza.belleza.empleado.values.TipoContrato;
import co.com.sofka.domain.generic.Entity;

public class Contrato extends Entity<ContratoId> {

    protected TipoContrato tipoContrato;

    public Contrato(ContratoId entityId) {
        super(entityId);
    }

    public Contrato(ContratoId entityId, TipoContrato tipoContrato) {
        super(entityId);
        this.tipoContrato = tipoContrato;
    }

    public void crearTipoContrato(String tipoContrato, String descripcion){
        this.tipoContrato = new TipoContrato(tipoContrato, descripcion);
    }
}
