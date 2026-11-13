package cl.ucen.bibliotecadigital.entities;

public class Usuario {

    private Integer id;
    private String nombre;
    private String categoria;
    static String  PREGRADO="PREGRADO";
    static String  POSTGRADO="POSTGRADO";
    static String  DOCENTE="DOCENTE";

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
