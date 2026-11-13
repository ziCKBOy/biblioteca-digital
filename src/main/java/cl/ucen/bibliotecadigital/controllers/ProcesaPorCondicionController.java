package cl.ucen.bibliotecadigital.controllers;

import cl.ucen.bibliotecadigital.entities.Asignacion;
import cl.ucen.bibliotecadigital.services.AsignacionServices;

public class ProcesaPorCondicionController {

    public static void main(String[] args) {

        AsignacionServices asignacionServices = new AsignacionServices();
        Asignacion[] asignaciones = asignacionServices.obtieneAsignacionesDiarias();
        int ubicacion = 0;
        while(asignaciones.length>0 && ubicacion<asignaciones.length){
            System.out.println("La asignacion "+asignaciones[ubicacion].getNombre() +"del material "+asignaciones[ubicacion].getMaterial().getNombreMaterial()+" " +
                    "prestada a "+asignaciones[ubicacion].getUsuario().getNombre() + "fue prestada por "+asignaciones[ubicacion].getDiasPrestamo()+" días.");
            asignacionServices.registrarResutado(asignaciones[ubicacion]);
            ubicacion++;
        }

    }
}
