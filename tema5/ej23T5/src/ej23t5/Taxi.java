/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej23t5;

/**
 *
 * @author Álvaro
 */
public class Taxi extends Vehiculo {
    //ATRIBUTOS
    private int numeroLicencia;
    
    //CONSTRUCTORES
    public Taxi() {
        super();
        this.numeroLicencia = 0;
    }
    
    public Taxi(String matricula, String modelo, int potenciaCV, int numeroLicencia) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }
    
    //GETTERS Y SETTERS
}
