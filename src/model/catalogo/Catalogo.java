package model.catalogo;

import java.util.ArrayList;

import model.audio.Audio;
import model.producto.Producto;
import model.usuario.Album;

public class Catalogo {
    // Atributos
    private ArrayList<Audio> audios;
    private ArrayList<Album> albumes;
    private ArrayList<Producto> productos;

    // Constructor
    public Catalogo() {
        this.audios = new ArrayList<>();
        this.albumes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    // Getters
    public ArrayList<Audio> getAudios() {
        return audios;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    // Metodos

    // [AUDIOS]

    public void agregarAudio(Audio audio){
        audios.add(audio);
    }

    public Audio buscarAudioId(String id) {
        for (Audio audio : audios) {
            if (audio.getId().equalsIgnoreCase(id)) {
                return audio;
            }
        }

        return null;
    }

    public boolean contieneAudioId(String id) {
        return buscarAudioId(id) != null;
    }

    public void eliminarAudio(Audio audio){
        audios.remove(audio);
    }

    // [ALBUMES]

    public void agregarAlbum(Album album){
        albumes.add(album);
    }

    public Album buscarAlbumId(String id) {
        for (Album album : albumes) {
            if (album.getId().equalsIgnoreCase(id)) {
                return album;
            }
        }
        return null;
    }

    public boolean contieneAlbumId(String id) {
        return buscarAlbumId(id) != null;
    }

    public void eliminarAlbum(Album album) {
        albumes.remove(album);
    }

    // [PRODUCTOS]

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoId(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equalsIgnoreCase(id)) {
                return producto;
            }
        }
        return null;
    }

    public boolean contieneProductoId(String id) {
        return buscarProductoId(id) != null;
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // [CATALOGO]

    public void limpiarCatalogo() {
        audios.clear();
        albumes.clear();
        productos.clear();
    }
}


