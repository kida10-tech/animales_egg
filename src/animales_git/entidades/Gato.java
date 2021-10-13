package animales_git.entidades;

public class Gato extends Animal {

    private String color;
    private double tamaño;
    private String comida;
    private String raza;

    public Gato() {
    }

    public Gato(String color, double tamaño, String comida, String raza, String nombre, Integer edad) {
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
        return "\nColor: " + color
                + "\nTamaño: " + tamaño
                + "\nComida: " + comida
                + "\nRaza: " + raza;
    }

}
