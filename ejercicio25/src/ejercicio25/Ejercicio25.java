
package ejercicio25;

/**
 *
 * @author álvaro Sánchez Díaz
 */

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar los tres números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();

        // Calcular la suma y el producto
        int suma = num1 + num2 + num3;
        int producto = num1 * num2 * num3;

        // Mostrar los resultados
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + producto);

        sc.close();
    }
}


