package co.com.salondebelleza.belleza.reservacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {
    private final String telefono;

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
