public class VideoAula {
    private String Nome;
    private VideoEstado estado;

    public VideoAula() {
        this.estado = VideoEstadoDisponivel.getInstance();
    }

    public void setEstado(VideoEstado estado) {
        this.estado = estado;
    }

    public boolean disponibilizar() {
        return estado.disponibilizar(this);
    }

    public boolean assistir() {
        return estado.assistir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public VideoEstado getEstado() {
        return estado;
    }
}
