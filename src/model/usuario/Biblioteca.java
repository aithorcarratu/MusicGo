package model.usuario;

import model.audio.Audio;

import java.util.ArrayList;

public class Biblioteca {
    // Atributos
    private ArrayList<Audio> audios;
    private ArrayList<Playlist> playlists;
    private ArrayList<Album> albumes;

    // Constructor
    public Biblioteca() {
        audios = new ArrayList<>();
        playlists = new ArrayList<>();
        albumes = new ArrayList<>();
    }

    // Getters
    public ArrayList<Audio> getAudios() {
        return audios;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    // Metodos

    // [AUDIOS]
    public void agregarAudio(Audio audio){
        audios.add(audio);
    }

    public Audio buscarAudioId(String id){
        for (Audio audio: audios){
            if (audio.getId().equalsIgnoreCase(id)){
                return audio;
            }
        }
        return null;
    }

    public boolean contieneAudioId(String id){
        return buscarAudioId(id) != null;
    }

    public int cantidadAudios(){
        return audios.size();
    }

    // [PLAYLISTS]
    public void agregarPlaylist(Playlist playlist){
        playlists.add(playlist);
    }

    public Playlist buscarPlaylistNombre(String nombre){
        for (Playlist playlist : playlists){
            if (playlist.getNombre().equalsIgnoreCase(nombre)){
                return playlist;
            }
        }
        return null;
    }

    public boolean contienePlaylistNombre(String nombre){
        return buscarPlaylistNombre(nombre) != null;
    }

    public int cantidadPlaylists(){
        return playlists.size();
    }

    // [ALBUMES]
    public void agregarAlbum(Album album){
        albumes.add(album);
    }

    public Album buscarAlbumId(String id){
        for (Album album: albumes){
            if (album.getId().equalsIgnoreCase(id)){
                return album;
            }
        }
        return null;
    }

    public boolean contieneAlbumId(String id){
        return buscarAlbumId(id) != null;
    }

    public int cantidadAlbumes(){
        return albumes.size();
    }

}

