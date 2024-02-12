import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Hombre de acero", 120, "Acción");

        Serie serie = new Serie("Hombre de acero serie", 30, 1);

        pelicula.agregarComentario("Gran pelicula, me encanto!");

       // Imprimir los comentarios de la película
        System.out.println("Comentarios de la película:");
        for (String comentario : Pelicula.getComentarios()) {
            System.out.println(comentario);
        }

        Usuario usuario = new Usuario("Roberto", "roberto@correo.com", "password123");

        Usuario.iniciarSesion(usuario);

        Documental documental1 = new Documental("Documental 1", 98, "Historia colonial");
        Documental documental2 = new Documental("Documental 2", 129, "Ciencia espacial");
        Documental documental3 = new Documental("Documental 3", 240, "Naturaleza y animales");

        List<Documental> documentales = new ArrayList<>();
        documentales.add(documental1);
        documentales.add(documental2);
        documentales.add(documental3);

        Collections.sort(documentales);

        for (Documental doc : documentales) {
            System.out.println(doc.getTitulo() + " - Tema: " + doc.getTema());
        }

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Roberto", "roberto@correo.com", "password123"));
        usuarios.add(new Usuario("Alicia", "alicia@correo.com", "password456"));
        usuarios.add(new Usuario("Juan", "juan@correo.com", "password789"));
        usuarios.add(new Usuario("Emilio", "emilio@correo.com", "password321"));
        usuarios.add(new Usuario("Miguel", "miguel@correo.com", "password654"));
        usuarios.add(new Usuario("Sofia", "sofia@correo.com", "password987"));
        usuarios.add(new Usuario("Guillermo", "guillermo@correo.com", "password135"));
        usuarios.add(new Usuario("Olivia", "olivia@correo.com", "password246"));
        usuarios.add(new Usuario("Esteban", "esteban@correo.com", "password579"));
        usuarios.add(new Usuario("Ana", "ana@correo.com", "password864"));

        Usuario usuarioAEliminar = new Usuario("Alicia", "alicia@correo.com", "password456");
        try {
            if (!usuarios.remove(usuarioAEliminar)) {
                throw new UsuarioNoEncontradoException("El usuario no existe en la colección");
            }
        } catch (UsuarioNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        Collections.sort(usuarios);

        for (Usuario u : usuarios) {
            System.out.println(u.getNombreUsuario());
        }

        usuarios = null;
    }
}

class UsuarioNoEncontradoException extends Exception {
    public UsuarioNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}