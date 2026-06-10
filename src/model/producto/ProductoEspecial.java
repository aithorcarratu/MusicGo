package model.producto;

public class ProductoEspecial extends Producto {
    private String descripcion;

    public ProductoEspecial(String id, String nombre, double precio, String descripcion) {
        super(id, nombre, precio);
        this.descripcion = descripcion;
    }

    @Override
    public void comprar() {

    }
}
