/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15t7;

/**
 *
 * @author Álvaro
 */
import java.util.Scanner;
import java.util.Random;

public class Ejercicio15T7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int[] ventas = new int[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int opcion;
        boolean ventasCargadas = false;

        do {
            System.out.println("\n--- MENÚ DE VENTAS ---");
            System.out.println("1. Rellenar ventas (aleatorio 10-100)");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas al revés");
            System.out.println("4. Mostrar suma total del año");
            System.out.println("5. Mostrar ventas de meses pares");
            System.out.println("6. Mes con más ventas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    for (int i = 0; i < ventas.length; i++) {
                        ventas[i] = rd.nextInt(91) + 10; // Genera entre 10 y 100
                    }
                    ventasCargadas = true;
                    System.out.println("¡Datos cargados correctamente!");
                }

                case 2 -> {
                    if (!ventasCargadas) { System.out.println("Primero debe cargar los datos (Opción 1)"); break; }
                    for (int i = 0; i < ventas.length; i++) {
                        System.out.println(meses[i] + ": " + ventas[i]);
                    }
                }

                case 3 -> {
                    if (!ventasCargadas) { System.out.println("Primero debe cargar los datos (Opción 1)"); break; }
                    for (int i = ventas.length - 1; i >= 0; i--) {
                        System.out.println(meses[i] + ": " + ventas[i]);
                    }
                }

                case 4 -> {
                    if (!ventasCargadas) { System.out.println("Primero debe cargar los datos (Opción 1)"); break; }
                    int suma = 0;
                    for (int v : ventas) suma += v;
                    System.out.println("Suma total anual: " + suma);
                }

                case 5 -> {
                    if (!ventasCargadas) { System.out.println("Primero debe cargar los datos (Opción 1)"); break; }
                    int sumaPares = 0;
                    // Meses pares: Febrero(índice 1), Abril(3), Junio(5), etc.
                    for (int i = 1; i < ventas.length; i += 2) {
                        System.out.println(meses[i] + ": " + ventas[i]);
                        sumaPares += ventas[i];
                    }
                    System.out.println("Total meses pares: " + sumaPares);
                }

                case 6 -> {
                    if (!ventasCargadas) { System.out.println("Primero debe cargar los datos (Opción 1)"); break; }
                    int maxVentas = ventas[0];
                    int indiceMax = 0;
                    for (int i = 1; i < ventas.length; i++) {
                        if (ventas[i] > maxVentas) {
                            maxVentas = ventas[i];
                            indiceMax = i;
                        }
                    }
                    System.out.println("El mes con más ventas fue " + meses[indiceMax] + " con " + maxVentas + " coches.");
                }

                case 7 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }
}