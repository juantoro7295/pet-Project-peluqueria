package co.com.salondebelleza.belleza.puestodetrabajo.entity;

import co.com.salondebelleza.belleza.puestodetrabajo.values.Categoria;
import co.com.salondebelleza.belleza.puestodetrabajo.values.ProductoId;
import co.com.sofka.domain.generic.Entity;
import generic.values.Nombre;

public class Producto extends Entity<ProductoId> {

    protected Nombre nombre;
    protected Categoria categoria;

    public Producto(ProductoId id, Nombre nombre, Categoria categoria) {
        super(id);
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public Producto(ProductoId id) {
        super(id);
    }

    public void crearProducto(String nombre, String categoria){
        this.nombre = new Nombre(nombre);
        this.categoria = new Categoria(categoria);
    }

    public void actualizarCategoria(String categoria){
        this.categoria = new Categoria(categoria);
    }

    public void actualizarNombre(String nombre){
        this.nombre = new Nombre(nombre);
    }
}
