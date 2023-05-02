public class VideoEstadoDisponivel extends VideoEstado{

    private VideoEstadoDisponivel() {};

    private static VideoEstadoDisponivel instance = new VideoEstadoDisponivel();
    public static VideoEstadoDisponivel getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Disponivel";
    }

    public boolean assistir(VideoAula videoAula) {
        videoAula.setEstado(VideoEstadoAssistido.getInstance());
        return true;
    }
}