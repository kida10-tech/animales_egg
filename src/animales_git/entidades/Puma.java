/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales_git.entidades;

/**
 *
 * @author Soda
 */
public class Puma extends Animal{
    
    private String color;
    private Integer energia;

    public Puma() {
    }

    public Puma(String color, Integer energia) {
        this.color = color;
        this.energia = energia;
    }

    public Puma(String color, Integer energia, String nombre, Integer edad) {
        super(nombre, edad);
        this.color = color;
        this.energia = energia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Integer getEdad() {
        return edad;
    }

    @Override
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    

    @Override
    public String mostrar() {
      
         return "Puma color "+ color + "energia "+energia;
       
    }

   
}
