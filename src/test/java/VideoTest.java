import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VideoTest {

    Video video;

    @BeforeEach
    public void setUp() {
        video = new Video();
    }

    // Video criado

    @Test
    public void naoDeveCriarVideoCriado() {
        video.setEstado(VideoEstadoCriado.getInstance());
        assertFalse(video.criar());
    }

    @Test
    public void deveEditarVideoCriado() {
        video.setEstado(VideoEstadoCriado.getInstance());
        assertTrue(video.editar());
        assertEquals(VideoEstadoEditado.getInstance(), video.getEstado());
    }

    @Test
    public void devePublicarVideoCriado() {
        video.setEstado(VideoEstadoCriado.getInstance());
        assertTrue(video.publicar());
        assertEquals(VideoEstadoPublicado.getInstance(), video.getEstado());
    }

    // Video editado

    @Test
    public void naoDeveCriarVideoEditado() {
        video.setEstado(VideoEstadoEditado.getInstance());
        assertFalse(video.criar());
    }

    @Test
    public void naoDeveEditarVideoEditado() {
        video.setEstado(VideoEstadoEditado.getInstance());
        assertFalse(video.editar());
    }

    @Test
    public void devePublicarVideoEditado() {
        video.setEstado(VideoEstadoEditado.getInstance());
        assertTrue(video.publicar());
        assertEquals(VideoEstadoPublicado.getInstance(), video.getEstado());
    }

    // Video publicado

    @Test
    public void naoDeveCriarVideoPublicado() {
        video.setEstado(VideoEstadoPublicado.getInstance());
        assertFalse(video.criar());
    }

    @Test
    public void naoDeveEditarVideoPublicado() {
        video.setEstado(VideoEstadoPublicado.getInstance());
        assertFalse(video.editar());
    }

    @Test
    public void naoDevePublicarVideoPublicado() {
        video.setEstado(VideoEstadoPublicado.getInstance());
        assertFalse(video.publicar());
    }

}