
/**
 *
 * @author Álvaro 
 */
public class Eje3T4 {

    package operaciones;


public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        int num1 = sc.nextInt();

        System.out.print("Ahora, introduzca un segundo número: ");
        int num2 = sc.nextInt();

        int resultado;
        String operacion;

        if (num1 > 10) {
            resultado = Calculadora.multiplicar(num1, num2);
            operacion = "producto";
        } else {
            resultado = Calculadora.sumar(num1, num2);
            operacion = "suma";
        }

        System.out.println("La operación que se realizó es " + operacion + " y el resultado es " + resultado + ".");
    }
}

