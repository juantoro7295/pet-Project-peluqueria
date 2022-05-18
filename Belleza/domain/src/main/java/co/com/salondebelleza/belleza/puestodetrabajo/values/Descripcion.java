package co.com.salondebelleza.belleza.puestodetrabajo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * objeto de valor Descripcion
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class Descripcion implements ValueObject<String> {

    /**
     * caracteristicas
     */
    private final String descripcion;

    /**
     * constructor
     *
     * @param descripcion de tipo String
     */

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
        if (this.descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede ser vacia");
        }

    }


    @Override
    public String value() {
        return descripcion;
    }
}
