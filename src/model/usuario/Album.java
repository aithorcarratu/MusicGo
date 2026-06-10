package model.usuario;

import java.time.LocalDate;
import java.util.ArrayList;

import model.audio.Cancion;


public class Album {
    private String id;
    private String titulo;
    private String artista;
    private String genero;
    private LocalDate fechaLanzamiento;
    private ArrayList<Cancion> cancionesAgregadas;
}
