/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej1t4;

/**
 *
 * @author ÁLVARO
 */
public class Ej1t4 {

    //Método que pide un número al usuario
    public static int pedirNumero() {
        int num = -1;
        do {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escribe un número: ");
            num = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Introduciste un dato erroneo");
        }
        return num;
        } while (num != -1);
        
    }
}