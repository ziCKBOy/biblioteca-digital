package cl.ucen.bibliotecadigital.services;

public class UsuarioServices {


    public Usuario buscarUsuario(String nombre) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setCategoria("DOCENTE");

        //debiera buscar en la base de datos (O EL JSON)
        return usuario;
    }

    public boolean tieneSanciones(Integer id) {
        //debiera buscar en la base de datos
        return false;
    }
}