package model.usuario;

import java.time.LocalDate;
import java.util.ArrayList;

import model.audio.Cancion;


public class Album {
    // Atributos
    private String id;
    private String titulo;
    private String artista;
    private String genero;
    private LocalDate fechaLanzamiento;
    private ArrayList<Cancion> canciones;

    // Constructor
    public Album(String id, String titulo, String artista, String genero, LocalDate fechaLanzamiento) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.fechaLanzamiento = fechaLanzamiento;
        canciones = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    // Metodos

    public void agregarCancion(Cancion cancion){
        canciones.add(cancion);
    }

    public Cancion buscarCancionId(String id){
        for (Cancion cancion : canciones){
            if (cancion.getId().equalsIgnoreCase(id)){
                return cancion;
            }
        }
        return null;
    }

    public boolean contieneCancionId(String id){
        return buscarCancionId(id) != null;
    }

    public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }

    public int cantidadCanciones() {
        return canciones.size();
    }

}
