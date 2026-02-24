public class Socio {
    private int idSocio;
    private String nombre;

    public Socio(int idSocio, String nombre) {
        this.idSocio = idSocio;
        this.nombre = nombre;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "ID Socio: " + idSocio + "Nombre: " + nombre;
    }
}