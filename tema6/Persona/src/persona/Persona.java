/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

/**
 *
 * @author alumno
 */
public abstract class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método abstracto que debe ser implementado por cada subclase.
     * @return saludo personalizado
     */
    public abstract String saludar();
}


    
    
