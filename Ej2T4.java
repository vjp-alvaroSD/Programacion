package operaciones;

import java.util.Scanner;

/**
 * Clase principal que solicita dos números al usuario y llama a los métodos de Calculadora.
 * @author Álvaro
 * @version 1.0
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        int num1 = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo número: ");
        int num2 = entrada.nextInt();

        if (num1 > 10) {
            int resultado = Calculadora.multiplicar(num1, num2);
            System.out.println("La operación que se realizó es producto y el resultado es " + resultado);
        } else {
            int resultado = Calculadora.sumar(num1, num2);
            System.out.println("La operación que se realizó es suma y el resultado es " + resultado);
        }
    }
}

