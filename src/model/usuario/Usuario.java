package model.usuario;

import model.audio.Audio;
import model.producto.Producto;

import java.util.ArrayList;

public class Usuario {
    // Atributos
    private String alias;
    private String correo;
    private String contrasenia;
    private Perfil perfil;
    private Estadistica estadisticas;

    // Constructor
    public Usuario(String alias, String correo, String contrasenia) {
        this.alias = alias;
        this.correo = correo;
        this.contrasenia = contrasenia;
        perfil = new Perfil();
        estadisticas = new Estadistica();
    }

    // Getters
    public String getAlias() {
        return alias;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public Biblioteca getBiblioteca() {
        return perfil.getBiblioteca();
    }

    public ArrayList<Playlist> getPlaylists() {
        return perfil.getPlaylists();
    }

    public ArrayList<Producto> getProductosComprados() {
        return perfil.getProductosComprados();
    }

    public Estadistica getEstadisticas() {
        return estadisticas;
    }

    // Setters

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    // Metodos

    // [CONTRASEÑA]

    public boolean validarContrasenia(String contrasenia) {
        return this.contrasenia.equals(contrasenia);
    }

    // [AUDIOS]

    public void descargarAudio(Audio audio){
        perfil.getBiblioteca().agregarAudio(audio);
        estadisticas.registrarDescarga(audio);
    }

    // [PLAYLISTS]

    public Playlist buscarPlaylist(String nombre) {
        return perfil.buscarPlaylist(nombre);
    }

    public boolean tienePlaylist(String nombre) {
        return perfil.tienePlaylist(nombre);
    }

    public void agregarPlaylist(Playlist playlist) {
        perfil.agregarPlaylist(playlist);
    }


    // [PRODUCTOS]

    public void comprarProducto(Producto producto) {
        perfil.comprarProducto(producto);
        estadisticas.registrarCompra();
    }

    public Producto buscarProductoCompradoId(String id) {
        return perfil.buscarProductoCompradoId(id);
    }

    public boolean tieneProductoId(String id) {
        return perfil.tieneProductoId(id);
    }

    // [ESTADISTICAS]
    public void registrarReproduccion(Audio audio){
        estadisticas.registrarReproduccion(audio);
    }

}
