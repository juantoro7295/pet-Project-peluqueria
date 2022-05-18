package co.com.salondebelleza.belleza.reservacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * Objeto de valor Telefono
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class Telefono implements ValueObject<String> {
    /**
     * Caracteristicas
     */
    private final String telefono;

    /**
     * constructor Telefono
     *
     * @param telefono de tipo String
     */

    public Telefono(String telefono) {
        this.telefono = Objects.requireNonNull(telefono);
        if (this.telefono.isBlank()) {
            throw new IllegalArgumentException("El telefono no puede estar vacio");
        }
    }

    @Override
    public String value() {
        return telefono;
    }
}
