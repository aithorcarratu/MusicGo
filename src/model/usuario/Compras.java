package model.usuario;

import model.producto.Producto;

import java.util.ArrayList;

public class Compras {
    // Atributos
    private ArrayList<Producto> productosComprados;

    // Constructor
    public Compras(){
        productosComprados = new ArrayList<>();
    }

    // Getter
    public ArrayList<Producto> getProductosComprados() {
        return productosComprados;
    }

    // Metodos
    public void agregarCompra(Producto producto){
        productosComprados.add(producto);
    }

    public Producto buscarProductoId(String id) {
        for (Producto producto : productosComprados) {
            if (producto.getId().equalsIgnoreCase(id)) {
                return producto;
            }
        }
        return null;
    }

    public boolean contieneProductoId(String id) {
        return buscarProductoId(id) != null;
    }

    public int cantidadCompras() {
        return productosComprados.size();
    }
}

