package model.usuario;

import model.producto.Producto;

import java.util.ArrayList;

public class Perfil {
    // Atributos
    private Biblioteca biblioteca;
    private Compras compras;

    // Constructor
    public Perfil(){
        biblioteca = new Biblioteca();
        compras = new Compras();
    }

    // Getters
    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public Compras getCompras() {
        return compras;
    }

    public ArrayList<Playlist> getPlaylists() {
        return biblioteca.getPlaylists();
    }

    public ArrayList<Producto> getProductosComprados() {
        return compras.getProductosComprados();
    }

    // Metodos

    // [PLAYLISTS -> BIBLIOTECA]
    public void agregarPlaylist(Playlist playlist) {
        biblioteca.agregarPlaylist(playlist);
    }

    public Playlist buscarPlaylist(String nombre) {
        return biblioteca.buscarPlaylistNombre(nombre);
    }

    public boolean tienePlaylist(String nombre) {
        return biblioteca.contienePlaylistNombre(nombre);
    }

    // [PRODUCTOS -> COMPRAS]

    public void comprarProducto(Producto producto) {
        compras.agregarCompra(producto);
    }

    public Producto buscarProductoCompradoId(String id) {
        return compras.buscarProductoId(id);
    }

    public boolean tieneProductoId(String id) {
        return compras.contieneProductoId(id);
    }
}
