
package main;

import entidad.Operacion;

// @author Artyom

public class Main {

    public static void main(String[] args) {
       
        Operacion operacion = new Operacion();
        
        operacion.crearOperacion();
        
        System.out.println("");
        
        System.out.println("La Suma de los Números es: " + operacion.sumar());
        System.out.println("La Resta de los Números es: " + operacion.restar());
        System.out.println("La Multiplicación de los Números es: " + operacion.multiplicar());
        System.out.println("La División de los Números es: " + operacion.dividir());
    }

}
