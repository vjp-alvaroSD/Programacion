/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academiasuperheroes.java;

/**
 *
 * @author Álvaro
 */
public class AcademiaSuperheroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Creamos una variable donde guardar a nuestros superheroes
        superhéroe superhéroe; 
        
        // ¡IMPORTANTE! No podemos crear objetos de clases abstractas;
        // tenemos que instanciar objetos de las subclases.       
//        superheroe = new Superheroe("Batman");

        // POLIMORFISMO
        // 2. Guardamos en una variable de la superclase
        // un objeto de cada subclase (uno Hulk y otro Flash).
        
        // 3. La misma expresión superheroe.entrenar() se comporta de forma distinta
//        superheroe = new Hulk("Hulk", 600);
//        superheroe.entrenar();
        
//        superheroe = new Flash("Flash", 3000);
//        superheroe.entrenar();
        
        
        
        // 4. Desde Superheroe no podemos llamar a métodos de las subclases
//        superheroe.dejarEstela();

        // 5. Solo podemos hacerlo desde la subclase       
//        Flash flash = new Flash("Nuevo Flash", 2000);        
//        flash.dejarEstela();
        
        // 6. Además, podemos usar los métodos de la superclase que Flash hereda
//        flash.presentarse();
        
        
        
        // 7. Podemos cambiar de cajita a los superhéroes usando casting
//        flash = (Flash)superheroe;
//        System.out.println(flash);
    }    

}