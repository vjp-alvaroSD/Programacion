/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio25t5;

/**
 *
 * @author ÁLVARO
 */
class Portatil  extends Ordenador { //Extiendo de la clase padre

    private String marca; //Variables
    private int tamaño;
    private int peso;

    public Portatil() { //Constructor por defecto
        this.marca = "";
        this.tamaño = 0;
        this.peso = 0;
    }

    public Portatil(String marca, int tamaño, int peso) { //Constructor parametrizado
        this.marca = marca;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    //GETTERS Y SETTERS
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override //To Sring
    public String toString() {
        return "Portatil -> Marca: " + this.marca
                + "Tamaño : " + this.tamaño
                + "Procesador: " + this.peso;

    }
}
    


    

