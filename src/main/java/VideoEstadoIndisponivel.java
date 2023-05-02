public class VideoEstadoIndisponivel extends VideoEstado{

    private VideoEstadoIndisponivel() {};

    private static VideoEstadoIndisponivel instance = new VideoEstadoIndisponivel();
    public static VideoEstadoIndisponivel getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Indisponivel";
    }

    public boolean assistir(VideoAula videoAula) {
        videoAula.setEstado(VideoEstadoIndisponivel.getInstance());
        return false;
    }

    public boolean disponibilizar(VideoAula videoAula) {
        videoAula.setEstado(VideoEstadoDisponivel.getInstance());
        return true;
    }
}
