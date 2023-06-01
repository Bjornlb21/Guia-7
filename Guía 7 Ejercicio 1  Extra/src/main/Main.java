
package main;

import entidad.Cancion;
import java.util.Scanner;

// @author Artyom

public class Main {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        Cancion cancion = new Cancion();
        
        System.out.print("Ingrese el Título de la Canción: ");
        cancion.setTitulo(leer.next());

        System.out.print("Ingrese el Autor de la Canción: ");
        cancion.setAutor(leer.next());
        
        System.out.println("");
        System.out.println(cancion);
    }

}
