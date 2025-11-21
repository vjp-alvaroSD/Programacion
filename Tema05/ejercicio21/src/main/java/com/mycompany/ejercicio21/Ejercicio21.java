/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21;
import java.util.Scanner;
/**
 *
 * @author Álvaro Sánchez 
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
public class Producto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float total = 0;
        boolean seguirComprando = true;

        // Crear los productos con constructor
        Producto p1 = new Producto("Comida para perros", 12.50f, 10);
        Producto p2 = new Producto("Juguete para gatos", 7.99f, 5);
        Producto p3 = new Producto("Arena para gatos", 9.25f, 8);

        do {
            mostrarMenu(p1, p2, p3);
            int opcion = pedirOpcion(entrada);
            Producto seleccionado = null;

            switch (opcion) {
                case 1:
                    seleccionado = p1;
                    break;
                case 2:
                    seleccionado = p2;
                    break;
                case 3:
                    seleccionado = p3;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            System.out.print("¿Cuántas unidades desea de " + seleccionado.getNombre() + "? ");
            int cantidad = Integer.parseInt(entrada.nextLine());

            if (seleccionado.hayStock(cantidad)) {
                seleccionado.vender(cantidad);
                float importe = cantidad * seleccionado.getPrecio();
                total += importe;
                System.out.println("Compra realizada. Importe: " + importe + " €");
            } else {
                System.out.println("Error: No hay suficiente stock. Intente de nuevo.");
                continue;
            }

            System.out.print("¿Desea comprar otro producto? (s/n): ");
            String respuesta = entrada.nextLine();
            seguirComprando = respuesta.equalsIgnoreCase("s");

        } while (seguirComprando);

        System.out.println("\nGracias por su compra. Importe total: " + total + " €");
    }

    /**
     * Muestra el menú de productos disponibles.
     */
    public static void mostrarMenu(Producto p1, Producto p2, Producto p3) {
        System.out.println("\n--- TIENDA DE MASCOTAS ---");
        System.out.println("1. " + p1.getNombre() + " - " + p1.getPrecio() + " € (" + p1.getStock() + " en stock)");
        System.out.println("2. " + p2.getNombre() + " - " + p2.getPrecio() + " € (" + p2.getStock() + " en stock)");
        System.out.println("3. " + p3.getNombre() + " - " + p3.getPrecio() + " € (" + p3.getStock() + " en stock)");
        System.out.print("Seleccione el producto que desea comprar: ");
    }

    /**
     * Pide la opción del menú al usuario.
     * @param entrada Scanner para leer datos
     * @return opción seleccionada
     */
    public static int pedirOpcion(Scanner entrada) {
        int opcion = -1;
        try {
            opcion = Integer.parseInt(entrada.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes introducir un número.");
        }
        return opcion;
    }
}
