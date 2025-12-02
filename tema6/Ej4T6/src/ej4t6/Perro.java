/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4t6;

/**
 *
 * @author Álvaro
 */
public class Perro extends Canido {
    public Perro(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    public String sonido() { return "Ladrido"; }
    public String alimentacion() { return "Carnívora"; }
    public String habitat() { return "Doméstico"; }
    public String nombreCientifico() { return "Canis lupus familiaris"; }
}
