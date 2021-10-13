package animales_git.entidades;

public class Pajaro extends Animal{
    protected String genero;
    protected String alimento;
    protected int alas;
    
    public Pajaro(){}
    public Pajaro(String nombre, Integer edad, String genero, String alimento, int alas){
        super(nombre,alas);
        this.genero = genero;
        this.alimento = alimento;
        this.alas = alas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String mostrar() {
        return "Pajaro{" + "genero=" + genero + ", alimento=" + alimento + ", alas=" + alas + '}';
    }
}
