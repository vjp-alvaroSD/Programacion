/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio25t5;

/**
 *
 * @author ÁLVARO
 */
class Ordenador  { 

    private int memoriaRAM; //Variables
    private int capacidadDisco;
    private String modeloProcesador;
    private String modeloGrafica;
    private double precio;

    // Constructor por defecto
    public Ordenador() {
        this.memoriaRAM = 0;
        this.capacidadDisco = 0;
        this.modeloProcesador = "";
        this.modeloGrafica = "";
        this.precio = 0.0;

    }

    // Constructor parametrizado
    public Ordenador(int memoriaRAM, int capacidadDisco, String modeloProcesador,
            String modeloGrafica, double precio) {
        this.memoriaRAM = memoriaRAM;
        this.capacidadDisco = capacidadDisco;
        this.modeloProcesador = modeloProcesador;
        this.modeloGrafica = modeloGrafica;
        this.precio = precio;

    }

    // Getters y setters
    public int getMemoriaRAM() {
        return this.memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getCapacidadDisco() {
        return this.capacidadDisco;
    }

    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }

    public String getModeloGrafica() {
        return this.modeloGrafica;
    }

    public void setModeloGrafica(String modeloGrafica) {
        this.modeloGrafica = modeloGrafica;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador -> RAM: " + this.memoriaRAM
                + "GB | Disco: " + this.capacidadDisco
                + "GB | Procesador: " + this.modeloProcesador
                + " | Gráfica: " + this.modeloGrafica
                + " | Precio: " + this.precio + " euros";
    }

}
    


    

