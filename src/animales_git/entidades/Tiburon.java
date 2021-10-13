/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales_git.entidades;

/**
 *
 * @author diegomartinezgiardini
 */
public class Tiburon extends Animal{
    
    private Boolean acuatico;
    private Boolean letal;
    private Boolean camina;
    private Double largo;

    public Tiburon() {
    }

    public Tiburon(Boolean acuatico, Boolean letal, Boolean camina, Double largo, String nombre, Integer edad) {
        super(nombre, edad);
        this.acuatico = acuatico;
        this.letal = letal;
        this.camina = camina;
        this.largo = largo;
    }

    public Boolean getAcuatico() {
        return acuatico;
    }

    public void setAcuatico(Boolean acuatico) {
        this.acuatico = acuatico;
    }

    public Boolean getLetal() {
        return letal;
    }

    public void setLetal(Boolean letal) {
        this.letal = letal;
    }

    public Boolean getCamina() {
        return camina;
    }

    public void setCamina(Boolean camina) {
        this.camina = camina;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
     
    @Override
    public String mostrar() {
        return "El tiburon "+ nombre +" y soy letal.";
    }

}
