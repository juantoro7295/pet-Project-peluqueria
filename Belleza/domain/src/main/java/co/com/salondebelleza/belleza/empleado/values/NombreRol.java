package co.com.salondebelleza.belleza.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * objeto de valor NombreRol
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */
public class NombreRol implements ValueObject<String> {
    private final String nombreRol;

    /**
     * Constructor NombreRol
     *
     * @param nombreRol
     */
    public NombreRol(String nombreRol) {
        this.nombreRol = Objects.requireNonNull(nombreRol);
        if (this.nombreRol.isBlank()) {
            throw new IllegalArgumentException("El nombre del rol no puede estar vacio");
        }
    }

    /**
     * Obtener nombre rol
     *
     * @return nombre rol
     */
    @Override
    public String value() {
        return nombreRol;
    }
}
