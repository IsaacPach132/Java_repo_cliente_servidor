public class Serie extends Audiovisual implements Comparable<Serie> {
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

    @Override
    public int compareTo(Serie otraSerie) {
        return this.getTitulo().compareTo(otraSerie.getTitulo());
    }
}