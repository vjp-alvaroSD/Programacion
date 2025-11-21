/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20t4;

/**
 *
 * @author Álvaro Sánchez Díaz 
 */
public class Ejercicio20T4 {
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colón";  
    
    public final static String PREGUNTA1 = "¿Cuál es la capital de España?";
    public final static String PREGUNTA2 = "¿Quién descubrió América?";
    
    
    public final static int PUNTUACIÓN = 5;
    
    /**
     * Método que le pide al usuario
     *la respuesta a la pregunta
     *@return la respuesta del usuario       
    */
    
    public static void String pedirRespuesta() {
        Scanner entrada = new scanner(source:System.in);
        String respuestaUsuario = entrada.nextLine();
        return respuestaUsuario;
    }
    
    /**
     * Método que compara que la respuesta del usuario 
     * con la respuesra correcta y devuelve true o false
     * 
     * @param respuestaUsuario
     * @param respuestaCorrecta
     * 
     * @return true si la respuesta es correcta y false si la respuesta es false
     */
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta) {
        boolean correcto;
        
        if(respuestaUsuario.equalsIgnorecase(anotherstring: respuestaCorrecta))
          correcto:true;
        } else {
            correcto = false
        }
        
        return correcto;
}               

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    int puntuaciónFinal 0 ;

}

