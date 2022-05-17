package co.com.salondebelleza.belleza.puestodetrabajo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoContrato implements ValueObject<String> {
    private final String tipoDeContrato;

    public TipoContrato(String tipoDeContrato) {
        this.tipoDeContrato = Objects.requireNonNull(tipoDeContrato);
        if (this.tipoDeContrato.isBlank()) {
            throw new IllegalArgumentException("El tipo de contrato no puede estar vacio");
        }
    }

    @Override
    public String value() {
        return tipoDeContrato;
    }
}
