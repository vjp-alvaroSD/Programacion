/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class test {
    
public class Test {

    /**
     * Método principal que realiza el examen.
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Enunciado[] preguntas = new Enunciado[4];

        preguntas[0] = new Enunciado("¿Cuál es la capital de España?", "Madrid");
        preguntas[1] = new Enunciado("¿Quién descubrió América?", "Cristóbal Colón");
        preguntas[2] = new Enunciado("¿Cuántos continentes hay?", "6");
        preguntas[3] = new Enunciado("¿Cuál es el río más largo del mundo?", "Amazonas");

        float nota = 0;

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i].getPregunta());
            System.out.print("Tu respuesta: ");
            String respuestaUsuario = entrada.nextLine();

            if (preguntas[i].esCorrecta(respuestaUsuario)) {
                System.out.println("✅ ¡Correcto!");
                nota += 2.5;
            } else {
                System.out.println("❌ Incorrecto. La respuesta correcta es: " + preguntas[i].getRespuestaCorrecta());
            }
            System.out.println();
        }

        System.out.println("Tu nota final es: " + nota + " sobre 10");
    }
}    

