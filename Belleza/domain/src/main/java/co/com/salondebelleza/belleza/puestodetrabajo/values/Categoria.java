package co.com.salondebelleza.belleza.puestodetrabajo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * objeto de valor Categoria
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class Categoria implements ValueObject<String> {
    /**
     * caracteristicas
     */
    private final String categoria;

    /**
     * constructor
     * @param categoria de tipo String
     */
    public Categoria(String categoria) {
        this.categoria = Objects.requireNonNull(categoria);
        if (this.categoria.isBlank()) {
            throw new IllegalArgumentException("La categoria no puede estar vacia");
        }

    }

    @Override
    public String value() {
        return categoria;
    }
}
