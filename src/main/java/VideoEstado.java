public abstract class VideoEstado {

    public abstract String getEstado();

    public boolean disponibilizar(VideoAula videoAula){
        return false;
    };

    public boolean assistir(VideoAula videoAula){
        return false;
    }

}
