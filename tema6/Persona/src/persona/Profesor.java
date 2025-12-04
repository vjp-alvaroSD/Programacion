/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author alumno
 */
public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    @Override
    public String saludar() {
        return "Hola, soy el profesor " + nombre + " y soy de la especialidad de " + especialidad + ".";
    }
}
