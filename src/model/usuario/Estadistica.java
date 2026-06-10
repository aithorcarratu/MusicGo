package model.usuario;

public class Estadistica {
    private int totalEscuchado;
    private int totalCompras;
    private int totalCanciones;
    private int totalPodcasts;

    public Estadistica(int totalEscuchado, int totalCompras, int totalCanciones, int totalPodcasts) {
        this.totalEscuchado = totalEscuchado;
        this.totalCompras = totalCompras;
        this.totalCanciones = totalCanciones;
        this.totalPodcasts = totalPodcasts;
    }

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

    public int getTotalCanciones() {
        return totalCanciones;
    }

    public void setTotalCanciones(int totalCanciones) {
        this.totalCanciones = totalCanciones;
    }

    public int getTotalPodcasts() {
        return totalPodcasts;
    }

    public void setTotalPodcasts(int totalPodcasts) {
        this.totalPodcasts = totalPodcasts;
    }
}
