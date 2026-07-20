package service;

import model.exception.MusicGoException;
import model.usuario.Usuario;

public class AuthService {

    private UsuarioService usuarioService;

    public AuthService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Usuario iniciarSesion(String identificador, String contrasenia) {
        validarCampo(identificador, "Ingrese su alias o correo.");

        validarCampo(contrasenia, "Ingrese su contraseña.");

        Usuario usuario = usuarioService.buscarPorAliasOCorreo(identificador);

        if (usuario == null) {
            throw new MusicGoException("No existe un usuario con ese alias o correo.");
        }

        if (!usuario.validarContrasenia(contrasenia)) {
            throw new MusicGoException("La contraseña es incorrecta.");
        }

        return usuario;
    }

    private void validarCampo(String valor, String mensajeError) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new MusicGoException(mensajeError);
        }
    }
}