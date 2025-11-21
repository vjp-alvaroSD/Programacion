/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7tema3;

/**
 *
 * @author ÁLVARO SÁNCHEZ DÍAZ
 */
public class Ejercicio8tema3 {

 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        // Solicitar importe al usuario
        System.out.print("Por favor, indique una cantidad de dinero: ");
        int importe = entrada.nextInt();
        
        int restante = importe;

        int billetes50 = restante / 50;
        restante %= 50;

        int billetes20 = restante / 20;
        restante %= 20;

        int billetes10 = restante / 10;
        restante %= 10;

        int billetes5 = restante / 5;
        restante %= 5;

        int monedas2 = restante / 2;
        restante %= 2;

        int monedas1 = restante;
        
        // Mostrar resultado
        System.out.println(importe + " Euros se descomponen en:");
        if (billetes50 > 0) System.out.println("Billetes de 50: " + billetes50);
        if (billetes20 > 0) System.out.println("Billetes de 20: " + billetes20);
        if (billetes10 > 0) System.out.println("Billetes de 10: " + billetes10);
        if (billetes5 > 0) System.out.println("Billetes de 5: " + billetes5);
        if (monedas2 > 0) System.out.println("Monedas de 2 euros: " + monedas2);
        if (monedas1 > 0) System.out.println("Monedas de 1 euro: " + monedas1);
    }
    
}