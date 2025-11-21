/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Álvaro
 */
public class Coche {
    // 1 . ATRIBUTOS: características. NUNCA se inicialian aquí.
private String ruedas;
private String suspensión;
private int espejos;

// 2 . CONSTRUCTORES: permite construir (instanciar) un objeto de este tipo
// Inicializan todos lo atributos
// 2.1. CONSTRUCTOR POR DEFECTO
public Coche() {
    this.ruedas = "";
    this.suspensión = "";
    this.espejos = 0;
}
      
// 2.2. CONSTRUCTOR PARAMETRIZADO (sobrecarga de métodos y autorreferencia this
public Coche(String ruedas, String suspensión, int espejos) {
    this.ruedas = ruedas;
    this.suspensión = suspensión;
    this.espejos = espejos;
}

// 3. MÉTODOS:
// 3.1 GETTERS Y SETTERS: devuelven y establecen el valor de los atributos
public String getRuedas() {
     return this.ruedas;  
}

public void setRuedas(String ruedas) {
    this.ruedas = ruedas;
}

public String getSuspensión() {
    return this.suspensión;
}

public void setSuspensión(String suspensión) {
    this.suspensión = suspensión;
}

public int getEspejos() {
    return this.espejos;
}

public void setEspejos(int espejos) {
    this.espejos = espejos;
}

// 3.2 OTROS MÉTODOS
public void acelerar() {
    System.out.println("Acelerando coche...");
}

public void frenar() {
    System.out.println("Frenando coche...");
}

public void girar() {
    System.out.println("Girando coche...");
}

// 4 TO STRING: devuelve ubn String con los datos del objeto
@Override
public String toString() {
    return "Mi coche tiene ruedas " + this.ruedas + ", suspensión " + " y " + this.espejos + " espejos ";
}

    
}