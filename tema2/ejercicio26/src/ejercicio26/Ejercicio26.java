
package ejercicio26;

/**
 *
 * @author Álvaro Sánchez Díaz
 */

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar número de 4 cifras
        System.out.print("Introduce un número de 4 cifras: ");
        int numero = sc.nextInt();

        // Validar que el número tenga 4 cifras
        if (numero < 1000 || numero > 9999) {
            System.out.println("El número debe tener exactamente 4 cifras.");
        } else {
            // Extraer cada cifra
            int cifra1 = numero / 1000;               // Mil
            int cifra2 = (numero / 100) % 10;         // Centena
            int cifra3 = (numero / 10) % 10;          // Decena
            int cifra4 = numero % 10;                 // Unidad

            // Mostrar cada cifra
            System.out.println("Las cifras del número son:");
            System.out.println("Mil: " + cifra1);
            System.out.println("Centena: " + cifra2);
            System.out.println("Decena: " + cifra3);
            System.out.println("Unidad: " + cifra4);
        }

        sc.close();
    }
}

