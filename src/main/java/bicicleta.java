/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Álvaro
 */
public class bicicleta {
   // ATRIBUTOS
   private int ruedas;
   private String manillar;
   private String pedales;
   private String frenos;
   private boolean estaPedaleando;
   
   // Atributo estático que pertenece a la clase 
   private static int numBicicletas = 0;
           
   // CONSTRUCTORES
   // Por defecto        
   public bicicleta() {
       this.ruedas = 0;
       this.pedales = "";
       this.pedales = "";
       this.frenos = "";
       this.estaPedaleando = false;
       
       // Incrementamos el valor del atributo estático
       incrementarnumBicicletas();
}

public bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando) {
    this.ruedas = ruedas;
    this.manillar = manillar;
    this.frenos = frenos;
    this.estaPedaleando = estaPedaleando;
    
    // Incrementamos el valor del atributo estático
    incrementarnumBicicletas();
}

// GETTERS Y SETTERS
public void setRuedas(int ruedas) {
    this.ruedas = ruedas;
}

public int getRuedas() {
    return this.ruedas;
}

public void setManillar(String manillar) {
    this.manillar = manillar;
}

public String getManillar() {
    return this.manillar;
}

public void setPedales(String pedales) {
    this.pedales = pedales;
}

public String getPedales() {
    return this.pedales;
}

public void setFrenos(String frenos ) {
    this.frenos = frenos;
}

public String getFrenos() {
    return this.frenos;
}

public void setestaPedaleando(boolean estaPedaleando) {
    this.estaPedaleando = estaPedaleando;
}

public boolean getestaPedaleando() {
    return this.estaPedaleando;
}

public int getNumBicicletas() {
    return this.numBicicletas;
}

// MÉTODOS
private void acelerar() {
    System.out.println("Acelerando...");
}

private void incrementarnumBicicletas() {
    numBicicletas++;
}

// TO STRING
@Override
public String toString() {
    return "Mi bicileta tiene " + this.ruedas +
            " un manillar " + this.manillar +
            " unos frenos " + this.frenos +
            " y ahora ¿estoy pedaleando? " + this.estaPedaleando;
}
}