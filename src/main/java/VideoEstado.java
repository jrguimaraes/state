public abstract class VideoEstado {
    public abstract String getEstado();

    public boolean criar(Video video) {
        return false;
    }

    public boolean editar(Video video) {
        return false;
    }

    public boolean publicar(Video video) {
        return false;
    }
}
