public class Documental extends Audiovisual implements Comparable<Documental> {
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

    @Override
    public int compareTo(Documental otroDocumental) {
        return this.tema.compareTo(otroDocumental.getTema());
    }
}