import model.exception.MusicGoException;
import model.usuario.Usuario;
import service.UsuarioService;

public class Main {

    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();

        probarRegistro(usuarioService);
        probarBusqueda(usuarioService);
        probarDuplicado(usuarioService);
    }

    private static void probarRegistro(UsuarioService usuarioService) {
        Usuario usuario = usuarioService.registrarUsuario(
                "fabian",
                "fabian@gmail.com",
                "Fabian Carratu",
                "1234"
        );

        System.out.println("Usuario registrado: " + usuario.getAlias());
    }

    private static void probarBusqueda(UsuarioService usuarioService) {
        Usuario porAlias =
                usuarioService.buscarPorAliasOCorreo("FABIAN");

        Usuario porCorreo =
                usuarioService.buscarPorAliasOCorreo("fabian@gmail.com");

        System.out.println("Búsqueda por alias: " + porAlias.getAlias());
        System.out.println("Búsqueda por correo: " + porCorreo.getCorreo());
    }

    private static void probarDuplicado(UsuarioService usuarioService) {
        try {
            usuarioService.registrarUsuario(
                    "fabian",
                    "otro@gmail.com",
                    "Otro usuario",
                    "5678"
            );
        } catch (MusicGoException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
    }
}