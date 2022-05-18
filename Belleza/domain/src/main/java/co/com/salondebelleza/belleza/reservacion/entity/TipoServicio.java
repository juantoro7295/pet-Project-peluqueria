package co.com.salondebelleza.belleza.reservacion.entity;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Descripcion;
import co.com.salondebelleza.belleza.reservacion.values.TipoServicioId;
import co.com.sofka.domain.generic.Entity;

public class TipoServicio extends Entity<TipoServicioId> {

    protected  Descripcion descripcion;

    public TipoServicio(TipoServicioId entityId, Descripcion descripcion) {
        super(entityId);
        this.descripcion = descripcion;
    }

    public void actualizarDescripcion(Descripcion descripcion){
        var tipoServicioId = new TipoServicioId("xx");
        TipoServicio tipoServicio = new TipoServicio(tipoServicioId, descripcion);
    }
}
