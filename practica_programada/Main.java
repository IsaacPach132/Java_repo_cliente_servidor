public class Main {

    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula("Hombre de acero", 120, "Acción");

        Serie serie = new Serie("Hombre de acero serie", 30, 1);

        Usuario usuario = new Usuario("Robert", "robert@correo.com", "password123");

        Usuario.iniciarSesion(usuario);
    }
}