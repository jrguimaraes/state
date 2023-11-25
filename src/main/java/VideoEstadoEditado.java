public class VideoEstadoEditado extends VideoEstado {
    private VideoEstadoEditado() {};
    private static VideoEstadoEditado instance = new VideoEstadoEditado();
    public static VideoEstadoEditado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Editado";
    }

    public boolean publicar(Video video) {
        video.setEstado(VideoEstadoPublicado.getInstance());
        return true;
    }
}
