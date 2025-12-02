/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4t6;

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) {
        // Parte 1: instanciación directa
        System.out.println("🔹 Instanciación directa:");
        Perro perro = new Perro("Mirabel", 3, 12.5f);
        Lobo lobo = new Lobo("Luna", 5, 35.0f);
        León leon = new León("Rey", 7, 190.0f);
        Gato gato = new Gato("Ángel", 2, 4.2f);

        perro.mostrarDatos();
        lobo.mostrarDatos();
        leon.mostrarDatos();
        gato.mostrarDatos();

        // Parte 2: polimorfismo
        System.out.println("🔹 Polimorfismo con referencias de tipo Animal:");
        Ej4T6[] animales = new Ej4T6[4];
        animales[0] = new Perro("Mirabel", 3, 12.5f);
        animales[1] = new Lobo("Luna", 5, 35.0f);
        animales[2] = new León("Rey", 7, 190.0f);
        animales[3] = new Gato("Ángel", 2, 4.2f);

        for (Ej4T6 a : animales) {
            a.mostrarDatos(); // se ejecuta la versión concreta del método
        }
    }
}
    

