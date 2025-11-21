/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

/**
 *
 * @author ÁLVARO SÁNCHEZ DÍAZ
 */
public class Ejercicio9 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        // Solicitar los números
        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = entrada.nextInt();

        System.out.print("Introduzca el tercer numero: ");
        int num3 = entrada.nextInt();

        System.out.print("Por último, introduzca un cuarto numero: ");
        int num4 = entrada.nextInt();

        // Ordenar manualmente usando intercambios
        int temp;
        
        // Comparaciones entre pares
        if (num1 > num2) { temp = num1; num1 = num2; num2 = temp; }
        if (num1 > num3) { temp = num1; num1 = num3; num3 = temp; }
        if (num1 > num4) { temp = num1; num1 = num4; num4 = temp; }
        if (num2 > num3) { temp = num2; num2 = num3; num3 = temp; }
        if (num2 > num4) { temp = num2; num2 = num4; num4 = temp; }
        if (num3 > num4) { temp = num3; num3 = num4; num4 = temp; }
        
        // Mostrar resultado
        System.out.println("El orden de los números introducidos es el " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
    
}
