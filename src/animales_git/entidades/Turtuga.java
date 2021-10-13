/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales_git.entidades;

/**
 *
 * @author ntarragona
 */
public class Turtuga extends Animal{
    private boolean cola;

    public Turtuga() {
    }

    public Turtuga(boolean cola) {
        this.cola = cola;
    }

    public Turtuga(boolean cola, String nombre, Integer edad) {
        super(nombre, edad);
        this.cola = cola;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    @Override
    public String toString() {
        return "Turtuga{" + "cola=" + cola + '}';
    }
    
    @Override
    public String mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
