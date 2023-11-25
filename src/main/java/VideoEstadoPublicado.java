public class VideoEstadoPublicado extends VideoEstado {
    private VideoEstadoPublicado() {};
    private static VideoEstadoPublicado instance = new VideoEstadoPublicado();
    public static VideoEstadoPublicado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Publicado";
    }

}
