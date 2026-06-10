package model.producto;

public class ProductoEspecial extends Producto {
    // Atributo
    private String descripcion;

    // Constructor
    public ProductoEspecial(String id, String nombre, double precio, String descripcion) {
        super(id, nombre, precio);
        this.descripcion = descripcion;
    }

    // Getter

    public String getDescripcion() {
        return descripcion;
    }

    // Metodos
    @Override
    public void comprar() {

    }
}
