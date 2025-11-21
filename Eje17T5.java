/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Eje17t5;

/**
 *
 * @author alumno
 */
public class Eje17T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
    private String pregunta;
    private String respuesta;

    /**
     * Constructor para crear una pregunta con su respuesta.
     * @param pregunta Texto de la pregunta
     * @param respuesta Respuesta correcta
     */
    public Eje17T5(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    

    /**
     * Devuelve el texto de la pregunta.
     * @return pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Verifica si la respuesta del usuario es correcta (ignorando mayúsculas/minúsculas).
     * @param respuestaUsuario Respuesta introducida por el usuario
     * @return true si es correcta, false si no
     */
    public boolean esCorrecta(String respuestaUsuario) {
        return respuestaUsuario.equalsIgnoreCase(respuesta);
    }

    /**
     * Devuelve la respuesta correcta.
     * @return respuesta
     */
    public String getRespuestaCorrecta() {
        return respuesta;
    }

