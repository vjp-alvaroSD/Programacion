/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 * 
 * @author Álvaro
 */
public class Suma extends Calculadora {
    private double sumando;

    public Suma(double numero, double sumando) {
        super(numero);
        this.sumando = sumando;
    }

    @Override
    public void realizarOperacion() {
        double resultado = numero + sumando;
        System.out.println("Resultado de la suma: " + resultado);
    }
}

