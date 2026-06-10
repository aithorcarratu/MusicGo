package model.producto;

public class ArteVisual extends Producto {
    // Atributos
    private String artista;
    private String formato;
    private String resolucion;

    // Constructor
    public ArteVisual(String id, String nombre, double precio, String artista, String formato, String resolucion) {
        super(id, nombre, precio);
        this.artista = artista;
        this.formato = formato;
        this.resolucion = resolucion;
    }

    // Getters
    public String getArtista() {
        return artista;
    }

    public String getFormato() {
        return formato;
    }

    public String getResolucion() {
        return resolucion;
    }

    // Metodos
    @Override
    public void comprar() {

    }
}
