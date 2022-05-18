package generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * Objeto de valor Nombre
 *
 * @author Camila Morales, Aura Russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */


public class Nombre implements ValueObject<String> {
    /**
     * caracteristicas
     */
    private final String value;

    /**
     * constructor
     * @param value String
     */
    public Nombre(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
    }

    @Override
    public String value() {

        return value;
    }
}
