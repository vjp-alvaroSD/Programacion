/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mamifero;

/**
 *
 * @author Álvaro
 */
public class Test {
    public static void main(String[] args) {
        // Instanciación directa
        Ornitorrinco o = new Ornitorrinco("Perry", "Macho", "Marrón", 5);
        Murcielago m = new Murcielago("Bruce", "Macho", "Negro", 3);

        System.out.println(o.obtenerMensajeOviparo());
        o.ponerHuevo();
        o.ponerHuevo();
        o.incubarHuevo();
        o.mostrarNumHuevos();

        System.out.println(m.obtenerMensajeVolador());
        m.aumentarAlturaVuelo();
        m.aumentarAlturaVuelo();
        m.bajarAlturaVuelo();
        m.mostrarAlturaVuelo();

        // Polimorfismo con interfaces
        Oviparo ov = new Ornitorrinco("Ovi", "Hembra", "Gris", 4);
        Volador vol = new Murcielago("Volo", "Hembra", "Gris", 2);

        System.out.println(ov.obtenerMensajeOviparo());
        ov.ponerHuevo();
        ov.mostrarNumHuevos();

        System.out.println(vol.obtenerMensajeVolador());
        vol.aumentarAlturaVuelo();
        vol.mostrarAlturaVuelo();
    }
}

