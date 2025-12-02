/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4t6;

/**
 *
 * @author Álvaro
 */
public class Lobo extends Canido {
    public Lobo(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    public String sonido() { return "Aullido"; }
    public String alimentacion() { return "Carnívora"; }
    public String habitat() { return "Bosque"; }
    public String nombreCientifico() { return "Canis lupus"; }
}
