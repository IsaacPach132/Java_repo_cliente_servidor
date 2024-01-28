public class Documental extends Audiovisual {
    private String tema;

    public Documental(String titulo, int duracion, String tema) {
        super(titulo, duracion);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}