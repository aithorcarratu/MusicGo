package model.catalogo;

import java.util.ArrayList;

import model.audio.Audio;
import model.producto.Producto;
import model.usuario.Album;

public class Catalogo {
    ArrayList<Audio> audios;
    ArrayList<Album> albumes;
    ArrayList<Producto> productos;

    public Catalogo(ArrayList<Audio> audios, ArrayList<Album> albumes, ArrayList<Producto> productos) {
        this.audios = audios;
        this.albumes = albumes;
        this.productos = productos;
    }

    public ArrayList<Audio> getAudios() {
        return audios;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}


