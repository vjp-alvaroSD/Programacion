/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mamifero;

/**
 *
 * @author Álvaro
 */
public class Ornitorrinco extends Mamifero implements Oviparo {
    private int numHuevos;

    public Ornitorrinco(String nombre, String sexo, String color, int edad) {
        super(nombre, sexo, color, edad);
        this.numHuevos = 0;
    }

    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamífero ovíparo.";
    }

    @Override
    public void ponerHuevo() {
        numHuevos++;
    }

    @Override
    public void incubarHuevo() {
        if (numHuevos > 0) numHuevos--;
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println("Número de huevos: " + numHuevos);
    }
}

