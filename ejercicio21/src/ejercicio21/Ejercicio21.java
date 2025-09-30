
package ejercicio21;

/**
 *
 * @author Álvaro Sánchez Díaz
 */ 
import java.util.Random;

public class TiempoConvertido {
    public static void main(String[] args) {
        // Generar número aleatorio de segundos (entre 1 y 1 millón)
        Random rand = new Random();
        int segundosTotales = rand.nextInt(1_000_000) + 1;

        // Mostrar los segundos generados
        System.out.println("Segundos generados: " + segundosTotales);

        // Conversión
        int dias = segundosTotales / 86400;
        int resto = segundosTotales % 86400;

        int horas = resto / 3600;
        resto = resto % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        // Mostrar resultado
        System.out.println("Equivalente a:");
        System.out.println(dias + " días");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
    }
}

   
    
    

