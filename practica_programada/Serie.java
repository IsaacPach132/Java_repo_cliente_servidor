public class Serie extends Audiovisual {
    private int temporada;

    public Serie(String titulo, int duracion, int temporada) {
        super(titulo, duracion);
        this.temporada = temporada;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}