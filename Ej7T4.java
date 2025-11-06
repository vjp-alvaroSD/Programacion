/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7T4;

import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class ej7T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4;                     //Declaro las variables
        Scanner entrada = new Scanner (System.in);      //Creo el Scanner
        
        System.out.println("Introduce el primer número");      //Pido por pantalla los números
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo número");
        num2 = entrada.nextInt();
        
        System.out.println("Introduce el tercer número");
        num3 = entrada.nextInt();
        
        System.out.println("Introduce el cuarto número");
        num4 = entrada.nextInt();
        
        Creciente.creciente(num1, num2, num3, num4);        //Llamo al metodo
    }
    
}
