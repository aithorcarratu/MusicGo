package model.audio;

import model.interfaces.IDescargable;
import model.interfaces.IReproducible;

import java.time.LocalDate;

public abstract class Audio implements IReproducible, IDescargable {
    private String id;
    private String titulo;
    private int duracionSeg;
    private LocalDate fechaLanzamiento;

    public Audio(String id, String titulo, int duracionSeg, LocalDate fechaLanzamiento){
        this.id = id;
        this.titulo = titulo;
        this.duracionSeg = duracionSeg;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getDuracionSeg(){
        return duracionSeg;
    }

    public LocalDate getFechaLanzamiento(){
        return fechaLanzamiento;
    }

}
