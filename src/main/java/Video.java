public class Video {
    private String nome;
    private VideoEstado estado;

    public Video() {
        this.estado = VideoEstadoCriado.getInstance();
    }

    public void setEstado(VideoEstado estado) {
        this.estado = estado;
    }

    public boolean criar() {
        return estado.criar(this);
    }

    public boolean editar() {
        return estado.editar(this);
    }

    public boolean publicar() {
        return estado.publicar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public VideoEstado getEstado() {
        return estado;
    }
}
