package model.usuario;

import model.audio.Audio;

import java.util.ArrayList;

public class Playlist {
    // Atributos
    private String nombre;
    private ArrayList<Audio> audios;

    // Constructor
    public Playlist(String nombre) {
        this.nombre = nombre;
        audios = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Audio> getAudios() {
        return audios;
    }

    // Metodos
    public Audio buscarAudioId(String id){
        for (Audio audio: audios){
            if (audio.getId().equalsIgnoreCase(id)){
                return audio;
            }
        }
        return null;
    }

    public boolean hayAudioId(String id){
        return buscarAudioId(id) != null;
    }

    public void agregarAudio(Audio audio){
        audios.add(audio);
    }

    public void eliminarAudio(Audio audio){
        audios.remove(audio);
    }
}
