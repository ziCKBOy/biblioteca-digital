package cl.ucen.bibliotecadigital.controllers;

import cl.ucen.bibliotecadigital.entities.Material;
import cl.ucen.bibliotecadigital.entities.Usuario;
import cl.ucen.bibliotecadigital.services.AsignacionServices;
import cl.ucen.bibliotecadigital.services.MaterialServices;
import cl.ucen.bibliotecadigital.services.UsuarioServices;

import java.util.Scanner;

public class BibliotecaController {

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario:");

        String userName = myObj.nextLine();
        UsuarioServices usuarioServices = new UsuarioServices();
        MaterialServices materialServices = new MaterialServices();
        AsignacionServices asignacionServices = new AsignacionServices();
        Usuario usuario = usuarioServices.buscarUsuario(userName);

        if(usuario!=null){
            boolean tieneSanciones = usuarioServices.tieneSanciones(usuario.getId());
            if(!tieneSanciones){
                Scanner myObj2 = new Scanner(System.in);
                System.out.println("Ingrese material de la asignacion:");

                String obj2 = myObj.nextLine();
                Material material = materialServices.existeMaterial(obj2);//nombre material
                if(material!=null){
                    System.out.println("Material: "+material.getNombreMaterial());
                    if(usuario.getCategoria().equals(usuario.PREGRADO)){
                        asignacionServices.asignaMaterial(material, usuario, 7);
                    }else if(usuario.getCategoria().equals(usuario.POSTGRADO)){
                        asignacionServices.asignaMaterial(material, usuario, 7);
                    }else if(usuario.getCategoria().equals(usuario.DOCENTE)){
                        asignacionServices.asignaMaterial(material, usuario, 7);
                    }
                }

            }else{
                System.out.println("Usuario tiene sanciones, no es posible prestar material.");
            }

        }else{
            System.out.println("Usuario no encontrado");
        }
    }
}
