/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academiasuperheroes.java;

/**
 *
 * @author Álvaro
 */
public class Flash extends Superheroe {
    // ATRIBUTOS
    private int velocidadMaxima;

    // CONSTRUCTORES
    public Flash() {
        super();
        this.velocidadMaxima = 1000;
    }
    
    public Flash(String nombre, int velocidadMaxima) {
        super(nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    // GETTERS Y SETTERS
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // MÉTODOS
    @Override
    public void entrenar() {
        System.out.println("\n - ENTRENAMIENTO DE " + super.getNombre() + " -");
        System.out.println("Correr 100km a 20km/h");
    }
    
    public void dejarEstela() {
        System.out.println("            \\");
        System.out.println("             \\\\");
        System.out.println("              \\\\");
        System.out.println("   F L A S H   \\\\=====================>>");
        System.out.println("              //");
        System.out.println("             //");
        System.out.println("            /");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Superhéroe Flash" +
                "\n · Nombre: " + super.getNombre() +
                "\n · Velocidad Máxima:" + velocidadMaxima;
    }
    
}
    

