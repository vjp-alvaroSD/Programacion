/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academiasuperheroes.java;

/**
 *
 * @author Álvaro
 */
public final class Instructor {
    // ATRIBUTOS
    private int aniosExperiencia;

    // CONSTRUCTORES
    public Instructor() {
        this.aniosExperiencia = 0;
    }

    public Instructor(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // GETTERS Y SETTERS
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // MÉTODOS
    public void motivar() {
        System.out.println("¡Mueve el culo! El mundo no se salvará solo.");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Instructor con " + aniosExperiencia + " años de experiencia";
    }

}
    

