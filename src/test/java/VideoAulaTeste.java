import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VideoAulaTeste {

    VideoAula videoAula;

    @BeforeEach
    public void setUp() {
        videoAula = new VideoAula();
    }

    @Test
    public void naoDeveDisponibilizarVideoDisponivel() {
        videoAula.setEstado(VideoEstadoDisponivel.getInstance());
        assertFalse(videoAula.disponibilizar());
    }

    @Test
    public void permiteAssistirVideoDisponivel() {
        videoAula.setEstado(VideoEstadoDisponivel.getInstance());
        assertTrue(videoAula.assistir());
        assertEquals(VideoEstadoAssistido.getInstance(), videoAula.getEstado());
    }

    @Test
    public void naoPermiteAssistirVideoIndisponivel() {
        videoAula.setEstado(VideoEstadoIndisponivel.getInstance());
        assertFalse(videoAula.assistir());
    }

    @Test
    public void permiteDisponibilizarVideoIndisponivel() {
        videoAula.setEstado(VideoEstadoIndisponivel.getInstance());
        assertTrue(videoAula.disponibilizar());
        assertEquals(VideoEstadoDisponivel.getInstance(), videoAula.getEstado());
    }
}
