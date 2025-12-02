/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academiasuperheroes.java;

/**
 *
 * @author Álvaro
 */
public abstract class Superheroe {
    // ATRIBUTOS
    private String nombre;

    // CONSTRUCTORES
    public Superheroe() {
        this.nombre = "";
    }
    
    public Superheroe(String nombre) {
        this.nombre = nombre;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // MÉTODOS
    /**
     * Método abstracto. 
     * Lo declaramos, pero no lo implementamos;
     * deben hacerlo las subclases (cada una a su manera),
     * es decir, todos los superhéroes entrenan, pero
     * cada uno a su manera.
     */
    public abstract void entrenar();
    
    /**
     * Método final. 
     * Las subclases no pueden sobreescribirlo, 
     * es decir, todos los superhéroes se presentan
     * y todos lo hacen igual.
     */
    public final void presentarse() {
        System.out.println("¡Hola! Soy " + this.nombre + " y mi misión es salvar el mundo.");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Superheroe " + nombre;
    }

}

    

