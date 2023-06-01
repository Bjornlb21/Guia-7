
package main;

import entidad.Rectangulo;


// @author Artyom

public class Main {

    public static void main(String[] args) {
       
        Rectangulo ro = new Rectangulo();
        
        ro.crearRectangulo();
        System.out.println("");
        
        System.out.println("La Superficie del Rectángulo es: " + ro.calcularSuperficie());
        System.out.println("El Perímetro del Rectángulo es: " + ro.calcularPerimetro());
        
        System.out.println("");
        System.out.println("========================");
        System.out.println("Gráfico del Rectángulo: ");
        System.out.println("");
        ro.dibujarRectangulo();
        System.out.println("");
        System.out.println("========================");

    }

}
