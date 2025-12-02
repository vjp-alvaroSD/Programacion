/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academiasuperheroes.java;

/**
 *
 * @author Álvaro
 */
public class Hulk extends Superheroe {
    // ATRIBUTOS
    private int fuerzaBruta;

    // CONSTRUCTORES
    public Hulk() {
        super();
        this.fuerzaBruta = 500;
    }

    public Hulk(String nombre, int fuerzaBruta) {
        super(nombre);
        this.fuerzaBruta = fuerzaBruta;
    }

    // GETTERS Y SETTERS
    public int getFuerzaBruta() {
        return fuerzaBruta;
    }

    public void setFuerzaBruta(int fuerzaBruta) {
        this.fuerzaBruta = fuerzaBruta;
    }

    // MÉTODOS
    @Override
    public void entrenar() {
        System.out.println("\n - ENTRENAMIENTO DE " + super.getNombre() + " -");
        System.out.println("Levantar edificios de 10 pisos.");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Superhéroe Hulk:" + 
                "\n · Nombre: " + super.getNombre() +
                "\n · Fuerza bruta:" + fuerzaBruta;
    }



   
}

    

