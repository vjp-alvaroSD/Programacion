/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona {
    private String grupo;

    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }

    @Override
    public String saludar() {
        return "Hola, soy el alumno " + nombre + " y estoy en el grupo de " + grupo + ".";
    }
}
