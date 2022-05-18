package co.com.salondebelleza.belleza.puestodetrabajo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Objeto de valor Fecha
 *
 * @author Camila Morales, Aura russil, Juan Pablo Toro, Juan Esteban Velasquez
 * @version 1.0.0
 * @since 1.0.0
 */

public class Fecha implements ValueObject<Fecha.Pros> {

    /**
     * caracteristicas
     */
    private final LocalDateTime hora;
    private final LocalDate dia;


    /**
     * constructor Fecha
     * @param hora de tipo LocalDateTime
     * @param dia de tipo LocalDate
     */
    public Fecha(LocalDateTime hora, LocalDate dia) {
        this.hora = Objects.requireNonNull(hora);
        this.dia = Objects.requireNonNull(dia);
        //validaciones
    }


    /**
     *  Objeto de valor Fecha compuesto, se usa una interfaz llamada
     *  pros para diferencias sus caracteristicas
     */

    @Override
    public Pros value() {
        return new Pros() {
            @Override
            public LocalDateTime hora() {
                return hora;
            }

            @Override
            public LocalDate dia() {
                return dia;
            }

        };
    }


    public interface Pros {

        LocalDateTime hora();

        LocalDate dia();
    }
}
