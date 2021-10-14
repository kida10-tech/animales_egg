/*
 * PANDA DE MARIANO
 */
package animales_git.entidades;

/**
 *
 * @author admin
 */
public abstract class Panda extends Animal {

    private boolean cola;
    private String color;
    private final int patas = 4;

    public Panda(boolean cola, String color, String nombre, Integer edad) {
        super(nombre, edad);
        this.cola = cola;
        this.color = color;
    }

    public Panda() {
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    public String toString() {
        return "Pantera{" + "Cola=" + cola + ", Color=" + color + ", Patas=" + patas + '}';
    }

}
