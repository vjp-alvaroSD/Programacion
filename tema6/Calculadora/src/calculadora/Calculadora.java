/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 * 
 * @author Álvaro
 */
public abstract class Calculadora {
    private double numero;

    public Calculadora(double numero) {
        this.numero = numero;
    }

    public abstract void realizarOperacion();
}

