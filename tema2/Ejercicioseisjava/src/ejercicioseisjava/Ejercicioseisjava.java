
package ejercicioseisjava;

/**
 *
 * @author Álvaro Sánchez Díaz
 */
public class Ejercicioseisjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita la nota al usuario
        System.out.print("Introduce la nota del alumno (0 a 10): ");
        int nota = scanner.nextInt();

        // Verifica si la nota está en el rango válido
        if (nota >= 0 && nota <= 10) {
            if (nota <= 4) {
                System.out.println("Calificación: Suspenso");
            } else if (nota <= 6) {
                System.out.println("Calificación: Bien");
            } else if (nota <= 8) {
                System.out.println("Calificación: Notable");
            } else {
                System.out.println("Calificación: Sobresaliente");
            }
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        }

        scanner.close();
    }
}

    
}
