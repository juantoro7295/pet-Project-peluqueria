package co.com.salondebelleza.belleza.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoContrato implements ValueObject<String> {
    private final String tipoDeContrato;
    private final String descripcion;

    public TipoContrato(String tipoDeContrato, String descripcion) {
        this.tipoDeContrato = Objects.requireNonNull(tipoDeContrato);
        if (this.tipoDeContrato.isBlank()) {
            throw new IllegalArgumentException("El tipo de contrato no puede estar vacio");
        }
        this.descripcion = Objects.requireNonNull(descripcion);
        if (this.descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede estar vacia");
        }
    }

    @Override
    public String value() {
        return tipoDeContrato;
    }
}
