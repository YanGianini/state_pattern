public class VideoEstadoAssistido extends VideoEstado{

    private VideoEstadoAssistido() {};

    private static VideoEstadoAssistido instance = new VideoEstadoAssistido();
    public static VideoEstadoAssistido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Assistido";
    }


}
