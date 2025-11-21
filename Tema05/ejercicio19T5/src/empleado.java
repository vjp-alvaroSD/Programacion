/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */

    public class empleado {
    //Variables
    private String nombre;
    private int horas;
    private float tarifa;
   
    public empleado(){ //Constructor por defecto
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0;
    }
    public empleado(String nombre, int horas, float tarifa){ //Constructor parametrizado
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    //Getters y Setters
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
   
    public int getHoras(){
        return this.horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
   
    public float getTarifa(){
        return this.tarifa;
    }
    public void setNombre(float tarifa){
        this.tarifa = tarifa;
    }
   
    //Metodos, para calcular las horas extras
    public float calcularSueldo(){
        int horasExtras;
        if (horas <= 40){
            return horas*tarifa;
        }
        else {
            horasExtras = horas-40;
           
            return (40 * tarifa)+ (horasExtras*tarifa*1.5f);
        }
    }
    //To string
    @Override
    public String toString(){
        return this.nombre +" a hecho: "+this.horas+" ha ganado: "+calcularSueldo();
    }
   
}

