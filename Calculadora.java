/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Álvaro
 */
public class Calculadora {// Método que suma dos números enteros
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    // Método que resta dos números enteros
    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    // Método que multiplica dos números enteros
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    // Método que divide dos números enteros
    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    // Método que calcula la raíz cuadrada usando Math.sqrt
    public static double raizCuadrada(int num) {
        return Math.sqrt(num);
    }

    // Método que calcula el cuadrado de un número usando Math.pow
    public static double cuadrado(int num) {
        return Math.pow(num, 2);
    }

    // Método que calcula el cubo de un número usando Math.pow
    public static double cubo(int num) {
        return Math.pow(num, 3);
    }

    // Método que redondea hacia abajo usando Math.floor
    public static double redondeoBajo(double num) {
        return Math.floor(num);
    }

    // Método que redondea hacia arriba usando Math.ceil
    public static double redondeoAlto(double num) {
        return Math.ceil(num);
    }

    // Método que calcula el logaritmo natural usando Math.log
    public static double logaritmo(int num) {
        return Math.log(num);
    }

    // Método que devuelve el mayor de dos números usando Math.max
    public static int valorMaximo(int num1, int num2) {
        return Math.max(num1, num2);
    }

    // Método que devuelve el menor de dos números usando Math.min
    public static int valorMinimo(int num1, int num2) {
        return Math.min(num1, num2);
    }
}

   
