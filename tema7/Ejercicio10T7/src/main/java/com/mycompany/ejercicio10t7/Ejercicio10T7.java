/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10t7;
import java.util.Random;

/**
 *
 * @author alumno
 */

public class Ejercicio10T7 {

    // Método que genera el array con números aleatorios entre 1 y 8
    public static int[] generarArray() {
        int[] array = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(8) + 1; // entre 1 y 8
        }

        return array;
    }

    // Método que muestra el array por pantalla
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    // Método que sustituye los elementos repetidos por 0
    public static void eliminarRepetidos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                array[i] = 0;
            }
        }
    }

    // Método principal
    public static void main(String[] args) {
        int[] miArray = generarArray();

        System.out.print("Se han generado los siguientes números: ");
        mostrarArray(miArray);

        eliminarRepetidos(miArray);

        System.out.print("Sustituimos los elementos repetidos por un 0: ");
        mostrarArray(miArray);
    }
}
