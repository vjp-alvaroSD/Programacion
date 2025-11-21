/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eje1t4;

/**
 *
 * @author Álvaro Sánchez Díaz 
 */
import java.util.Scanner;

public class ej1T4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        int numero = scanner.nextInt();

        String resultado = determinarSigno(numero);
        System.out.println("El número introducido es " + resultado);
    }

    public static String determinarSigno(int numero) {
        if (numero >= 0) {
            return "positivo";
        } else {
            return "negativo";
        }
    }
}

