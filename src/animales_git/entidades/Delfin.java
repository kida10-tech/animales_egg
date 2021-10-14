/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales_git.entidades;

/**
 *
 * @author Martina
 */
public class Delfin extends Animal{

    
     private String color;
    private double tamaño;
    private String comida;
    private String raza;

    public Delfin() {
    }

    public Delfin(String color, double tamaño, String comida, String raza, String nombre, Integer edad) {
        super(nombre, edad);
        this.color = color;
        this.tamaño = tamaño;
        this.comida = comida;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

 
    
    
    
    @Override
    public String mostrar() {
       return "hola soy un delfin";
    }
    
    
    
}
