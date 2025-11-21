/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class empleado {
    
    private String nombre;
    private int salario;
    private direccion direccion;
    

    public empleado(String nombre, int salario, direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario + " €");
        System.out.println("Dirección:");
        System.out.println("   Calle: " + direccion.getCalle());
        System.out.println("   Número: " + direccion.getNumero());
        System.out.println("   Piso: " + direccion.getPiso());
        System.out.println("   Ciudad: " + direccion.getCiudad());
        System.out.println();
    }
}
