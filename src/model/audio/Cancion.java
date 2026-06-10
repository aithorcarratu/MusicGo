package model.audio;

import java.time.LocalDate;

public class Cancion extends Audio {
    private String artista;
    private String album;
    private String genero;

    public Cancion(String id, String titulo, int duracionSeg, LocalDate fechaLanzamiento, String artista, String album, String genero){
        super(id, titulo, duracionSeg, fechaLanzamiento);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }
}
