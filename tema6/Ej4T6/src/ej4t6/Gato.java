/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4t6;

/**
 *
 * @author Álvaro
 */
public class Gato extends Felino {
    public Gato(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    public String sonido() { return "Maullido"; }
    public String alimentacion() { return "Ratones"; }
    public String habitat() { return "Doméstico"; }
    public String nombreCientifico() { return "Felis silvestris catus"; }
}
