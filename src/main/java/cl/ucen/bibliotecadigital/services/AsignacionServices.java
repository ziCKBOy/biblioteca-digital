package cl.ucen.bibliotecadigital.services;

import cl.ucen.bibliotecadigital.entities.Asignacion;
import cl.ucen.bibliotecadigital.entities.Material;
import cl.ucen.bibliotecadigital.entities.Usuario;

public class AsignacionServices {

    public void asignaMaterial(Material material, Usuario usuario, Integer dias  ){
        System.out.println(usuario.getNombre()+" es "+usuario.getCategoria()+", material será asignado por "+dias+" días.");
    }

    public Asignacion[] obtieneAsignacionesDiarias() {
        return new Asignacion[120];
    }

    public void registrarResutado(Asignacion asignacion) {
    }
}
