package service;

import model.exception.MusicGoException;
import model.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    private final ArrayList<Usuario> usuarios;

    public UsuarioService() {
        usuarios = new ArrayList<>();
    }

    public List<Usuario> listarUsuarios() {
        return new ArrayList<>(usuarios);
    }

    public Usuario buscarPorAliasOCorreo(String identificador) {
        if (identificador == null) {
            return null;
        }
        String textoBuscado = identificador.trim();

        for (Usuario usuario : usuarios) {
            boolean coincideAlias =
                    usuario.getAlias().equalsIgnoreCase(textoBuscado);
            boolean coincideCorreo =
                    usuario.getCorreo().equalsIgnoreCase(textoBuscado);
            if (coincideAlias || coincideCorreo) {
                return usuario;
            }
        }
        return null;
    }

    private void validarCampo(String valor, String mensajeError) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new MusicGoException(mensajeError);
        }
    }

    public Usuario registrarUsuario(
            String alias,
            String correo,
            String nombre,
            String contrasenia
    ) {
        validarCampo(alias, "El alias es obligatorio.");
        validarCampo(correo, "El correo es obligatorio.");
        validarCampo(nombre, "El nombre completo es obligatorio.");
        validarCampo(contrasenia, "La contraseña es obligatoria.");

        if (buscarPorAliasOCorreo(alias) != null) {
            throw new MusicGoException("El alias ya está registrado.");
        }

        if (buscarPorAliasOCorreo(correo) != null) {
            throw new MusicGoException("El correo ya está registrado.");
        }

        Usuario nuevoUsuario = new Usuario(alias.trim(), correo.trim(), nombre.trim(), contrasenia);
        usuarios.add(nuevoUsuario);

        return nuevoUsuario;
    }
}