/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Álvaro
 */
public class test {
    
    public static void main(String[] args) {
        // Crear direcciones
        Direccion d1 = new Direccion("Calle Mayor", 12, "2ºA", "Plasencia");
        Direccion d2 = new Direccion("Avenida España", 45, "3ºB", "Cáceres");
        Direccion d3 = new Direccion("Paseo del Prado", 8, "1ºC", "Madrid");

        // Crear empleados
        Empleado e1 = new Empleado("Lucía Gómez", 1800, d1);
        Empleado e2 = new Empleado("Carlos Ruiz", 2200, d2);
        Empleado e3 = new Empleado("Marta Sánchez", 2000, d3);

        // Mostrar datos
        System.out.println("EMPLEADO 1:");
        e1.mostrarDatos();

        System.out.println("EMPLEADO 2:");
        e2.mostrarDatos();

        System.out.println("EMPLEADO 3:");
        e3.mostrarDatos();
    }
}
