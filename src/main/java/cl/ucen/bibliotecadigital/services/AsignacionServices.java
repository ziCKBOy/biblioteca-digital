package cl.ucen.bibliotecadigital.services;

public class AsignacionServices {

    public void asignaMaterial(Material material,Usuario usuario, Integer dias  ){
        System.out.println(usuario.getNombre()+" es "+usuario.getCategoria()+", material será asignado por "+dias+" días.");
    }

    public Asignacion[] obtieneAsignacionesDiarias() {
        return new Asignacion[120];
    }

    public void registrarResutado(Asignacion asignacion) {
    }
}
