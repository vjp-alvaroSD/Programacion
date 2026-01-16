/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioo4t7;

/**
 *
 * @author Álvaro
 */


import java.util.Random;

public class Ejercicioo4T7 {

    /**
     * Método que rellena un array bidimensional de 4x3 con números aleatorios entre 100 y 200
     * @param matriz array bidimensional de enteros
     */
    public static void rellenarMatriz(int[][] matriz) {
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(101) + 100; // genera entre 100 y 200
            }
        }
    }

    /**
     * Método que muestra solo los números pares del array bidimensional
     * @param matriz array bidimensional de enteros
     */
    public static void mostrarPares(int[][] matriz) {
        System.out.println("Números pares encontrados en la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.println("[" + i + "][" + j + "] --> " + matriz[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[4][3]; // array bidimensional de 4x3
        rellenarMatriz(matriz);         // llamamos al método para rellenar
        mostrarPares(matriz);          // llamamos al método para mostrar pares
    }
}
