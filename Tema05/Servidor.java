/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio25t5;

/**
 *
 * @author ÁLVARO
 */
class Servidor extends Ordenador { //Extiendo de la clase padre

    private int tamañoMonitor; //Variables
    private String teclado;
    private String raton;

    public Servidor() { //Constructor por defecto
        this.tamañoMonitor = 0;
        this.teclado = "";
        this.raton = "";
    }

    public Servidor(int tamañoMonitor, String teclado, String raton) { //Constructor parametrizado
        this.tamañoMonitor = tamañoMonitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    //GETTERS Y SETTERS
    public int getTamañoMonitor() {
        return this.tamañoMonitor;
    }

    public void setTamañoMonitor(int tamañoMonitor) {
        this.tamañoMonitor = tamañoMonitor;
    }

    public String getTeclado() {
        return this.teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getRaton() {
        return this.raton;
    }

    public void setRaton(String raton) {
        this.raton = raton;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Servidor -> Monitor: " + this.tamañoMonitor
                + " | Teclado : " + this.teclado
                + " | Raton : " + this.raton;

    }
}
    


    

