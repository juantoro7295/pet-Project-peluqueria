package co.com.salondebelleza.belleza.reservacion.entity;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Descripcion;
import co.com.salondebelleza.belleza.reservacion.values.TipoServicioId;
import co.com.sofka.domain.generic.Entity;

/**
 * Entidad tipo de servicio
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class TipoServicio extends Entity<TipoServicioId> {

    /**
     * Caracteristicas
     */
    protected Descripcion descripcion;

    /**
     * Constructor TipoServicio
     *
     * @param entityId
     * @param descripcion
     */
    public TipoServicio(TipoServicioId entityId, Descripcion descripcion) {
        super(entityId);
        this.descripcion = descripcion;
    }

    /**
     * metodo actualizarDescripcion
     *
     * @param descripcion de tipo Descripcion
     */

    public void actualizarDescripcion(Descripcion descripcion) {
        var tipoServicioId = new TipoServicioId("xx");
        TipoServicio tipoServicio = new TipoServicio(tipoServicioId, descripcion);
    }
}
