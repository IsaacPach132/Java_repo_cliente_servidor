public class Pelicula extends Audiovisual implements Comparable<Pelicula> {
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

    @Override
    public int compareTo(Pelicula otraPelicula) {
        return this.getTitulo().compareTo(otraPelicula.getTitulo());
    }
}