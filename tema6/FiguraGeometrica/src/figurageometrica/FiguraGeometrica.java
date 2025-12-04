/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurageometrica;

/**
 *
 * @author alumno
 */
public abstract class FiguraGeometrica {
    protected String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

