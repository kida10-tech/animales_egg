
package animales_git.entidades;

public class Perro extends Animal{

    private String race;
    private String size;

    public Perro() {
    }

    public Perro(String race, String size, String nombre, Integer edad) {
        super(nombre, edad);
        this.race = race;
        this.size = size;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
        return "Nombre: "+nombre+", Raza: "+race+", Tamaño: "+size;
    }
}
