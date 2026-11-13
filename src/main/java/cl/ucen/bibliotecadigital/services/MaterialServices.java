package cl.ucen.bibliotecadigital.services;

public class MaterialServices {

    public Material existeMaterial(String nombreMaterial){
        Material material=new Material();
        material.setNombreMaterial(nombreMaterial);
        return material;
    }
}
