/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 * @author Álvaro
 */
public class Empleado {
    private String nombre;
    private int horas;
    private float tarifa;

    /**
     * Constructor que pide los datos del empleado por teclado.
     */
    public Empleado() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.print("Introduce las horas trabajadas: ");
        horas = entrada.nextInt();
        System.out.print("Introduce la tarifa por hora: ");
        tarifa = entrada.nextFloat();
    }

    /**
     * Calculo el sueldo bruto del empleado.
     * @return sueldo bruto
     */
    public float calcularSueldoBruto() {
        float sueldo;
        if (horas <= 40) {
            sueldo = horas * tarifa;
        } else {
            sueldo = 40 * tarifa + (horas - 40) * tarifa * 1.5f;
        }
        return sueldo;
    }

    /**
     * Muestra el resumen del empleado y su sueldo.
     */
    public void mostrar() {
        System.out.println(nombre + " trabajó " + horas + " horas, cobra " + tarifa + " euros la hora.");
        System.out.println("Le corresponde un sueldo de " + calcularSueldoBruto() + " euros.");
    }
}
