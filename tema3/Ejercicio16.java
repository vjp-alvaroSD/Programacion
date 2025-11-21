/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    private String nombre;
    private int nota;

    /**
     * Constructor para crear un alumno con nombre y nota.
     * @param nombre Nombre del alumno
     * @param nota Nota del alumno (0 a 10)
     */
    public Ejercicio16(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    /**
     * Devuelve el nombre del alumno.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la nota del alumno.
     * @return nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * Muestra la calificación textual según la nota.
     */
    public void mostrarCalificacion() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Nota: " + nota);
        if (nota >= 0 && nota <= 4) {
            System.out.println("Calificación: Suspenso");
        } else if (nota <= 6) {
            System.out.println("Calificación: Bien");
        } else if (nota <= 8) {
            System.out.println("Calificación: Notable");
        } else if (nota <= 10) {
            System.out.println("Calificación: Sobresaliente");
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        }
        System.out.println();
    }
}
