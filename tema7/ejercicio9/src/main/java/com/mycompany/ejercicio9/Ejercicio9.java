/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

/**
 *
 * @author Álvaro
 */
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        // 1. Pedir el número
        int numero = pedirNumero();
        
        // 2. Calcular cuántas cifras tiene
        int cantidadCifras = calcularCifras(numero);
        
        // 3. Meter las cifras en un array
        int[] cifrasArray = descomponerEnArray(numero, cantidadCifras);
        
        // 4. Visualizar el array al revés
        visualizarAlReves(cifrasArray);
    }

    // Método para pedir el número al usuario
    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        return sc.nextInt();
    }

    // Método para calcular cuántas cifras tiene el número
    public static int calcularCifras(int num) {
        // Convertimos a positivo por si el usuario introduce un negativo
        return String.valueOf(Math.abs(num)).length();
    }

    // Método para dividir el número en cifras y meterlas en un array
    public static int[] descomponerEnArray(int num, int tamano) {
        int[] array = new int[tamano];
        int auxiliar = Math.abs(num);
        
        // Extraemos las cifras de derecha a izquierda usando el operador módulo (%)
        for (int i = 0; i < tamano; i++) {
            array[i] = auxiliar % 10;
            auxiliar = auxiliar / 10;
        }
        return array;
    }

    // Método para visualizar el array (que ya contiene las cifras invertidas)
    public static void visualizarAlReves(int[] array) {
        System.out.print("El numero introducido escrito al revés es el: ");
        for (int cifra : array) {
            System.out.print(cifra);
        }
        System.out.println(); // Salto de línea final
    }
}