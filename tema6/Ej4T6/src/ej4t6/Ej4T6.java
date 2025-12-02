/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4t6;

/**
 *
 * @author Álvaro
 */
public abstract class Ej4T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
    private String nombre;
    private int edad;
    private float peso;


    public Ej4T6(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public abstract String sonido();
    public abstract String alimentacion();
    public abstract String habitat();
    public abstract String nombreCientifico();

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Sonido: " + sonido());
        System.out.println("Alimentación: " + alimentacion());
        System.out.println("Hábitat: " + habitat());
        System.out.println("Nombre científico: " + nombreCientifico());
        System.out.println("-----------------------------");
    }
}

        
    
    

