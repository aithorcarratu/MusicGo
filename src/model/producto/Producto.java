package model.producto;

import model.interfaces.IComprable;

public abstract class Producto implements IComprable {
    // Atributos
    private String id;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Metodos

    public boolean esGratis(){
        return precio == 0;
    }
}
