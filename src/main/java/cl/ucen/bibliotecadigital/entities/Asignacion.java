package cl.ucen.bibliotecadigital.entities;

public class Asignacion {

    Integer asignacion;
    String nombre;
    String diasPrestamo;
    Material material;
    Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(String diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public Integer getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Integer asignacion) {
        this.asignacion = asignacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
