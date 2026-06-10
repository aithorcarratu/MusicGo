package model.audio;

import java.time.LocalDate;

public class Podcast extends Audio {
    String anfitrion;
    String descripcion;
    String tematica;

    public Podcast(String id, String titulo, int duracionSeg, LocalDate fechaLanzamiento, String anfitrion, String descripcion, String tematica){
        super(id, titulo, duracionSeg, fechaLanzamiento);
        this.anfitrion = anfitrion;
        this.descripcion = descripcion;
        this.tematica = tematica;
    }

    public String getAnfitrion() {
        return anfitrion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTematica() {
        return tematica;
    }

}
