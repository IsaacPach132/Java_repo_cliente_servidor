public class Pelicula extends Audiovisual {
    private String genero;

    public Pelicula(String titulo, int duracion, String genero) {
        super(titulo, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}