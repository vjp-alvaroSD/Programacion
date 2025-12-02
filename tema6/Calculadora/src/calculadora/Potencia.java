/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 * 
 * @author Álvaro
 */
public class Potencia extends Calculadora {
    private int exponente;

    public Potencia(double numero, int exponente) {
        super(numero);
        this.exponente = exponente;
    }

    @Override
    public void realizarOperacion() {
        double resultado = Math.pow(numero, exponente);
        System.out.println("Resultado de la potencia: " + resultado);
    }
}
