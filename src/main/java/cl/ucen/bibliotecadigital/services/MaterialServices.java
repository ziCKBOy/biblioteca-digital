package cl.ucen.bibliotecadigital.services;

import cl.ucen.bibliotecadigital.entities.Material;

public class MaterialServices {

    public Material existeMaterial(String nombreMaterial){
        Material material=new Material();
        material.setNombreMaterial(nombreMaterial);
        return material;
    }
}
