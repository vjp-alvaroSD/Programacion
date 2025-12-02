/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mamifero;

/**
 *
 * @author Álvaro
 */
public class Murcielago extends Mamifero implements Volador {
    private int alturaVuelo;

    public Murcielago(String nombre, String sexo, String color, int edad) {
        super(nombre, sexo, color, edad);
        this.alturaVuelo = 0;
    }

    @Override
    public String obtenerMensajeVolador() {
        return "El murciélago es un animal volador.";
    }

    @Override
    public void aumentarAlturaVuelo() {
        alturaVuelo += 5;
    }

    @Override
    public void bajarAlturaVuelo() {
        if (alturaVuelo >= 5) alturaVuelo -= 5;
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("Altura de vuelo: " + alturaVuelo + " metros");
    }
}
