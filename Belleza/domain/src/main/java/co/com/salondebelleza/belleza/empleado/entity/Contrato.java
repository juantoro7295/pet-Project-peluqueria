package co.com.salondebelleza.belleza.empleado.entity;

import co.com.salondebelleza.belleza.empleado.values.ContratoId;
import co.com.salondebelleza.belleza.empleado.values.TipoContrato;
import co.com.sofka.domain.generic.Entity;

/**
 * Entidad Contrato
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class Contrato extends Entity<ContratoId> {

    protected TipoContrato tipoContrato;

    public Contrato(ContratoId entityId) {
        super(entityId);
    }

    /**
     * Contructor de Contrato
     *
     * @param entityId
     * @param tipoContrato
     */
    public Contrato(ContratoId entityId, TipoContrato tipoContrato) {
        super(entityId);
        this.tipoContrato = tipoContrato;
    }

    /**
     * Metodo para crearTipoContrato
     *
     * @param tipoContrato
     * @param descripcion
     */

    public void crearTipoContrato(String tipoContrato, String descripcion) {
        this.tipoContrato = new TipoContrato(tipoContrato, descripcion);
    }
}
