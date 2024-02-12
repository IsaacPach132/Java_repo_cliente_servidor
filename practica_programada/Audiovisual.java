import java.util.ArrayList;
import java.util.Collection;

public abstract class Audiovisual {
    private String titulo;
    private int duracion;
    protected static Collection<String> comentarios = new ArrayList<>();

    public Audiovisual(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public static void agregarComentario(String comentario) {
        comentarios.add(comentario);
    }
}