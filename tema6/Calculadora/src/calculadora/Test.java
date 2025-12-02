/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 * 
 * @author Álvaro
 */
public class Test {
    public static void main(String[] args) {
        // Instanciación directa
        System.out.println("🔹 Instanciación directa:");
        Suma suma = new Suma(10, 5);
        Multiplicacion multiplicacion = new Multiplicacion(4, 3);
        Potencia potencia = new Potencia(2, 4);

        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();

        // Polimorfismo
        System.out.println("\n🔹 Polimorfismo con referencias de tipo Calculadora:");
        Calculadora[] operaciones = {
            new Suma(10, 5),
            new Multiplicacion(4, 3),
            new Potencia(2, 4)
        };

        for (Calculadora op : operaciones) {
            op.realizarOperacion(); // se ejecuta la versión concreta del método
        }
    }
}

