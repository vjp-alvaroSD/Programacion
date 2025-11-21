
package ejercicio24;

/**
 *
 * @author Álvaro Sánchez Díaz
 */

public class MediaDAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar las notas al usuario
        System.out.print("Introduce la nota de Programación: ");
        double programacion = sc.nextDouble();

        System.out.print("Introduce la nota de Lenguajes de Marcas: ");
        double lenguajesMarcas = sc.nextDouble();

        System.out.print("Introduce la nota de Bases de Datos: ");
        double basesDatos = sc.nextDouble();

        System.out.print("Introduce la nota de Entornos de Desarrollo: ");
        double entornos = sc.nextDouble();

        System.out.print("Introduce la nota de Sistemas Informáticos: ");
        double sistemas = sc.nextDouble();

        System.out.print("Introduce la nota de Formación y Orientación Laboral: ");
        double fol = sc.nextDouble();

        // Calcular la media
        double media = (programacion + lenguajesMarcas + basesDatos + entornos + sistemas + fol) / 6;

        // Mostrar el resultado
        System.out.printf("La nota media del curso es: %.2f\n", media);

        sc.close();
    }
}
