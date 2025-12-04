/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) {
        // Instanciación directa
        Profesor profe = new Profesor("Carlos", "Matemáticas");
        Alumno alumno = new Alumno("Lucía", "1ºDAM");

        System.out.println(profe.saludar());
        System.out.println(alumno.saludar());

        // Polimorfismo con referencias de tipo Persona
        Persona p1 = new Profesor("Ana", "Lengua");
        Persona p2 = new Alumno("David", "2ºDAW");

        System.out.println(p1.saludar());
        System.out.println(p2.saludar());
    }
}
