/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5t7;

/**
 *
 * @author Álvaro
 */


import java.util.Scanner;

public class Ejercicio5T7 {

    /**
     * Método para que el usuario introduzca los valores en la matriz
     */
    public static void rellenarMatriz(int[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los valores para una matriz de 4x2:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    /**
     * Método para mostrar la matriz de forma atractiva
     */
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("\n-- MATRIZ INTRODUCIDA --");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]\t");
            }
            System.out.println();
        }
    }

    /**
     * Método para calcular el valor máximo
     */
    public static int calcularMaximo(int[][] matriz) {
        int max = matriz[0][0];
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor > max) {
                    max = valor;
                }
            }
        }
        return max;
    }

    /**
     * Método para calcular el valor mínimo
     */
    public static int calcularMinimo(int[][] matriz) {
        int min = matriz[0][0];
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor < min) {
                    min = valor;
                }
            }
        }
        return min;
    }

    /**
     * Método para calcular la suma de todos los elementos
     */
    public static int calcularSuma(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[4][2];
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);

        int maximo = calcularMaximo(matriz);
        int minimo = calcularMinimo(matriz);
        int suma = calcularSuma(matriz);

        System.out.println("\n-- RESULTADOS --");
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Suma total: " + suma);
    }
}
