
package main;

import entidad.Puntos;


// @author Artyom

public class Main {

    public static void main(String[] args) {
       
        Puntos puntos = new Puntos();
        
        puntos.crearPuntos();
        System.out.println("");
        System.out.println("Distancia entre los Puntos: " + puntos.distanciaPuntos());

    }

}
