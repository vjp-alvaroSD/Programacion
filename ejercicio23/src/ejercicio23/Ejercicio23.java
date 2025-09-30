package ejercicio23;

/**
 *
 * @author Álvaro Sánchez Díaz
 */
public class Ejercicio23 {

import java.util.Scanner;

public class CalculadoraCompra {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio del producto
        System.out.print("Introduce el precio del producto (€): ");
        double precio = scanner.nextDouble();

        // Solicitar la cantidad de unidades
        System.out.print("¿Cuántas unidades deseas comprar?: ");
        int cantidad = scanner.nextInt();

        // Calcular el total
        double total = precio * cantidad;

        // Mostrar el resultado
        System.out.printf("El total de la compra es: %.2f €%n", total);
    }


    