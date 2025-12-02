/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej23t5;

/**
 *
 * @author Álvaro
 */
public class Vehiculo {
        // ATRIBUTOS
        private String matricula;
        private String modelo;
        private int potenciaCV;
        
        // CONSTRUCTORES
        public Vehiculo() {
            this.matricula = "";
            this.modelo = "";
            this.potenciaCV = "";
            
        }
        
        public Vehiculo(String matricula, String modelo, int potenciaCV) {
            this.matricula = matricula;
            this.modelo = modelo;
            this.potenciaCV = potenciaCV;
        }
        
        //GETTERS Y SETTERS
        public String getMatricula() {
            return this.matricula;
        }
        
        public void setMtricula(String matricula) {
            this.matricula = matricula;
        }
        
        public String getModelo() {
            return this.modelo;
        }
        
        public void setModelo(String modelo) {
                this.modelo = modelo;
        }
       
        
