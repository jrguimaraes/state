public class VideoEstadoCriado extends VideoEstado {

    private VideoEstadoCriado() {};
    private static VideoEstadoCriado instance = new VideoEstadoCriado();
    public static VideoEstadoCriado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Criado!";
    }

    public boolean editar(Video video) {
        video.setEstado(VideoEstadoEditado.getInstance());
        return true;
    }

    public boolean publicar(Video video) {
        video.setEstado(VideoEstadoPublicado.getInstance());
        return true;
    }

}
