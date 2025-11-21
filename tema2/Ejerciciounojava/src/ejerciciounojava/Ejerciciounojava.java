

/**
 *
 * @author Álvaro Sánchez Díaz
 */
public class Ejerciciounojava {

    /**
     * @param args the command line arguments
     */

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que introduzca un número
        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        // Verifica si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        scanner.close();
    }
}

    }
    

