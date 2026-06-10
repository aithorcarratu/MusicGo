package model.usuario;

import model.audio.Audio;
import model.audio.Cancion;
import model.audio.Podcast;

public class Estadistica {
    // Atributos
    private int totalEscuchado;
    private int totalCompras;
    private int totalCancionesDescargadas;
    private int totalPodcastsDescargados;

    // Constructores
    public Estadistica() {
        totalEscuchado = 0;
        totalCompras = 0;
        totalCancionesDescargadas = 0;
        totalPodcastsDescargados = 0;
    }

    public Estadistica(int totalEscuchado, int totalCompras, int totalCanciones, int totalPodcasts) {
        this.totalEscuchado = totalEscuchado;
        this.totalCompras = totalCompras;
        this.totalCancionesDescargadas = totalCanciones;
        this.totalPodcastsDescargados = totalPodcasts;
    }

    // Getters y Setters
    public int getTotalEscuchado() {
        return totalEscuchado;
    }

    public void setTotalEscuchado(int totalEscuchado) {
        this.totalEscuchado = totalEscuchado;
    }

    public int getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }

    public int getTotalCancionesDescargadas() {
        return totalCancionesDescargadas;
    }

    public void setTotalCancionesDescargadas(int totalCancionesDescargadas) {
        this.totalCancionesDescargadas = totalCancionesDescargadas;
    }

    public int getTotalPodcastsDescargados() {
        return totalPodcastsDescargados;
    }

    public void setTotalPodcastsDescargados(int totalPodcastsDescargados) {
        this.totalPodcastsDescargados = totalPodcastsDescargados;
    }

    // Metodos
    public void registrarReproduccion(Audio audio){
        totalEscuchado += audio.getDuracionSeg();
    }

    public void registrarDescarga(Audio audio) {
        if (audio instanceof Cancion) {
            totalCancionesDescargadas++;
        } else if (audio instanceof Podcast){
            totalPodcastsDescargados++;
        }
    }

    public void registrarCompra(){
        totalCompras++;
    }
}
