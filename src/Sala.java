public class Sala {
    private int idSala;
    private String descripcion;
    public Sala(int idSala, String descripcion) {
        this.idSala = idSala;
        this.descripcion = descripcion;
    }

    public int getIdSala() {
        return idSala;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String toString() {
        return "Sala #" + idSala + descripcion;
    }
}