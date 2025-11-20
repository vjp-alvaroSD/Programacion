/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodireccion;

/**
 *
 * @author alumno
 */
public class Ejerciciodireccion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


    private String calle;
    private int numero;
    private String piso;
    private String ciudad;

    public Direccion(String calle, int numero, String piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getPiso() {
        return piso;
    }

    public String getCiudad() {
        return ciudad;
    }
}
