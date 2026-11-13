package cl.ucen.bibliotecadigital.controllers;

public class ContadorController {

    public static void main(String[] args) {

        AsignacionServices as = new AsignacionServices();
        Asignacion[] asignaciones = as.obtieneAsignacionesDiarias();

        System.out.println("asignaciones encontradas:"+asignaciones.length);
        for(Asignacion asignacion: asignaciones){
            System.out.println("La asignacion "+asignacion.getNombre() +"del material "+asignacion.getMaterial().getNombreMaterial()+" " +
                    "prestada a "+asignacion.getUsuario().getNombre() + "fue prestada por "+asignacion.getDiasPrestamo()+" días.");
            as.registrarResutado(asignacion);

        }
        System.out.println("fin procesamiento.");

    }
}