package model.usuario;

import model.audio.Audio;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Audio> audiosGuardados;
    private ArrayList<Playlist> playlistGuardadas;
    private ArrayList<Album> albumesGuardados;

    public Biblioteca() {
        audiosGuardados = new ArrayList<>();
        playlistGuardadas = new ArrayList<>();
        albumesGuardados = new ArrayList<>();
    }

    public ArrayList<Audio> getAudiosGuardados() {
        return audiosGuardados;
    }

    public ArrayList<Playlist> getPlaylistGuardadas() {
        return playlistGuardadas;
    }

    public ArrayList<Album> getAlbumesGuardados() {
        return albumesGuardados;
    }
}

