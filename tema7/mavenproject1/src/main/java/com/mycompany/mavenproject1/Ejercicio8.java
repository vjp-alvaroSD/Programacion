    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Álvaro
 */
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        int numero = pedirNumero();
        int[] cifras = dividirEnCifras(numero);
        mostrarArray(cifras);
    }

    // Método que pide el número al usuario
    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduzca un número entero de 5 cifras: ");
            num = sc.nextInt();
        } while (num < 10000 || num > 99999);

        return num;
    }

    // Método que divide el número en cifras y las guarda en un array al revés
    public static int[] dividirEnCifras(int numero) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = numero % 10;
            numero /= 10;
        }

        return array;
    }

    // Método que muestra el array
    public static void mostrarArray(int[] array) {
        System.out.print("El numero introducido escrito al revés es el: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
