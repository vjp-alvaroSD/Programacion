/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 * 
 * @author Álvaro
 */
public class Multiplicacion extends Calculadora {
    private double multiplicador;

    public Multiplicacion(double numero, double multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }

    @Override
    public void realizarOperacion() {
        double resultado = numero * multiplicador;
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
}

