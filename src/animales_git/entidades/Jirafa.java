/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales_git.entidades;

/**
 *
 * @author celes
 */
public class Jirafa extends Animal {

    private int altura;
    private String sexo;
    private String especie;

    public Jirafa() {
    }
    
    
    
    @Override
    public String mostrar() {
        return "hola, soy una jirafa";
    }
    
}
