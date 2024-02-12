public class Usuario implements Comparable<Usuario> {
    private String nombreUsuario;
    private String correo;
    private String contraseña;

    public Usuario(String nombreUsuario, String correo, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public static void iniciarSesion(Usuario usuario) {
        System.out.println("¡Bienvenido " + usuario.getNombreUsuario() + "!");
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int compareTo(Usuario otroUsuario) {
        return this.nombreUsuario.compareTo(otroUsuario.getNombreUsuario());
    }
}