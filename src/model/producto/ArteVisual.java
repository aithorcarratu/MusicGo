package model.producto;

public class ArteVisual extends Producto {
    private String artista;
    private String formato;
    private String resolucion;

    public ArteVisual(String id, String nombre, double precio, String artista, String formato, String resolucion) {
        super(id, nombre, precio);
        this.artista = artista;
        this.formato = formato;
        this.resolucion = resolucion;
    }

    public String getArtista() {
        return artista;
    }

    public String getFormato() {
        return formato;
    }

    public String getResolucion() {
        return resolucion;
    }

    @Override
    public void comprar() {

    }
}
