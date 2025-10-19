/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6tema3;

/**
 *
 * @author ÁLVARO SÁNCHEZ DÍAZ
 */
public class Ejercicio6tema3 {

 public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        // Solicitar la nota al usuario
        System.out.println("Por favor, introduzca la nota del alumno (0 a 10): ");
        int nota = entrada.nextInt();
        
        // Evaluar la nota y mostrar la calificación
        if (nota >= 0 && nota <= 10) {
            if (nota <= 4) {
                System.out.println("Calificación: Suspenso");
            } else if (nota <= 6) {
                System.out.println("Calificación: Bien");
            } else if (nota <= 8) {
                System.out.println("Calificación: Notable");
            } else {
                System.out.println("Calificación: Sobresaliente");
            }
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        }
    }
    
}
