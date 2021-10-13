/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales_git.entidades;

import java.time.chrono.ThaiBuddhistDate;

/**
 *
 * @author maxco
 */
public class Leon extends Animal{
    private String muelas;
    private String dieta;
    private String habitat;
    private String alimentacion;
    private int pata;

    public Leon(String muelas, String dieta, String habitat, String alimentacion, int pata) {
        this.muelas = muelas;
        this.dieta = dieta;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.pata = pata;
    }

    public Leon(String muelas, String dieta, String habitat, String alimentacion, int pata, String nombre, Integer edad) {
        super(nombre, edad);
        this.muelas = muelas;
        this.dieta = dieta;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.pata = pata;
    }

    public String getMuelas() {
        return muelas;
    }

    public void setMuelas(String muelas) {
        this.muelas = muelas;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getPata() {
        return pata;
    }

    public void setPata(int pata) {
        this.pata = pata;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    

    @Override
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Leon");
        sb.append("\nNombre:").append(nombre);
        sb.append("\nEdad:").append(edad);
        sb.append("\nMuelas:").append(muelas);
        sb.append("\nDieta:").append(dieta);
        sb.append("\nHabitat:").append(habitat);
        sb.append("\nAlimentacion:").append(alimentacion);
        sb.append("\nPata:").append(pata);
        return sb.toString();
    }
    
}
