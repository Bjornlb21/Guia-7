
package main;

import entidad.Libro;

// @author Artyom

public class Main {

    public static void main(String[] args) {
       
        Libro libro = new Libro();
        
        libro.cargarLibro();
        System.out.println("=================================");
        libro.mostrarLibro();
    }

}
