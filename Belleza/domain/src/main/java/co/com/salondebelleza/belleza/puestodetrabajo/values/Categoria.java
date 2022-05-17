package co.com.salondebelleza.belleza.puestodetrabajo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Categoria implements ValueObject<String> {
    private final String categoria;

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
