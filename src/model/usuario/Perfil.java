package model.usuario;

public class Perfil {
    private Biblioteca biblioteca;
    private Compras compras;

    public Perfil(){
        biblioteca = new Biblioteca();
        compras = new Compras();
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public Compras getCompras() {
        return compras;
    }
}
