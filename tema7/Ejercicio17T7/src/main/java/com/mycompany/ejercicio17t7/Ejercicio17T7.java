/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17t7;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Álvaro
 */



public class Ejercicio17T7 {

    // Método que genera el array con números aleatorios entre 0 y 9
    public static int[] generarArrayAleatorio() {
        int[] array = new int[10];
        Random aleatorio = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(10); // entre 0 y 9
        }

        return array;
    }

    // Método que muestra el array por pantalla
    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    // Método que ordena el array de mayor a menor
    public static void ordenarArrayDescendente(int[] array) {
        Arrays.sort(array); // ordena de menor a mayor
        // invertimos el array
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    // Método principal
    public static void main(String[] args) {
        int[] miArray = generarArrayAleatorio();

        System.out.println("🔹 Array original:");
        mostrarArray(miArray);

        ordenarArrayDescendente(miArray);

        System.out.println("🔹 Array ordenado de mayor a menor:");
        mostrarArray(miArray);
    }
}

