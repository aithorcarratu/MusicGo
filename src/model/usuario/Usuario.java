package model.usuario;

public class Usuario {
    private String alias;
    private String correo;
    private String contrasenia;
    private Perfil perfil;

    public Usuario(String alias, String correo, String contrasenia) {
        this.alias = alias;
        this.correo = correo;
        this.contrasenia = contrasenia;
        perfil = new Perfil();
    }

    public String getAlias() {
        return alias;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
