package model.usuario;

import model.producto.Producto;

import java.util.ArrayList;

public class Compras {
    private ArrayList<Producto> productosComprados;

    public Compras(){
        productosComprados = new ArrayList<>();
    }

    public ArrayList<Producto> getProductosComprados() {
        return productosComprados;
    }
}

