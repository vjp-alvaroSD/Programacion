/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19t5;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio19T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {int horas1, horas2, horas3;
        String nombre1, nombre2, nombre3;
        float tarifa1, tarifa2, tarifa3; //Variables

        Scanner entrada = new Scanner(System.in);

        try {
// Empleado 1

            System.out.println("=== Empleado 1 ===");
            System.out.print("Nombre: ");
            nombre1 = entrada.nextLine();
            System.out.print("Horas trabajadas: ");
            horas1 = entrada.nextInt();
            System.out.print("Tarifa por hora: ");
            tarifa1 = entrada.nextFloat();
            entrada.nextLine(); // Limpiar buffer
            Empleado empleado1 = new empleado(nombre1, horas1, tarifa1); //Creamos el objeto y tomamos los valores que ha introducido el usuario

            // Empleado 2
            System.out.println("=== Empleado 2 ===");
            System.out.print("Nombre: ");
            nombre2 = entrada.nextLine();
            System.out.print("Horas trabajadas: ");
            horas2 = entrada.nextInt();
            System.out.print("Tarifa por hora: ");
            tarifa2 = entrada.nextFloat();
            entrada.nextLine(); // Limpiar buffer
            Empleado empleado2 = new Empleado(nombre2, horas2, tarifa2);//Creamos el objeto y tomamos los valores que ha introducido el usuario

            // Empleado 3
            System.out.println("=== Empleado 3 ===");
            System.out.print("Nombre: ");
            nombre3 = entrada.nextLine();
            System.out.print("Horas trabajadas: ");
            horas3 = entrada.nextInt();
            System.out.print("Tarifa por hora: ");
            tarifa3 = entrada.nextFloat();
            entrada.nextLine(); // Limpiar buffer
            Empleado empleado3 = new Empleado(nombre3, horas3, tarifa3);//Creamos el objeto y tomamos los valores que ha introducido el usuario

            System.out.println(empleado1.toString()); //Llamamos al to string para cada objeto creado
            System.out.println(empleado2.toString());
            System.out.println(empleado3.toString());
           
        } catch (InputMismatchException e) {
            System.out.println("Introduce un valor correcto");
        }
    }

}
        
    
    

