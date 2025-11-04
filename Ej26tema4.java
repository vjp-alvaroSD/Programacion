/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej26tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej26tema4 {

    
     public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        int divisor = 2;
        while (divisor <= numero / 2) {
            if (numero % divisor == 0) {
                return false;
            }
            divisor++;
        }

        return true;
    }

    /**
     * Método principal que solicita un número al usuario y muestra si es primo.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        int n = entrada.nextInt();

        if (esPrimo(n)) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido NO es primo.");
        }
    }
}

