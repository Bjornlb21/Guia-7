
package main;

import entidad.Circunferencia;


// @author Artyom

public class Main {

    public static void main(String[] args) {
       
        Circunferencia circunferencia = new Circunferencia();
        
        circunferencia.crearCircunferencia();
        System.out.println("===================================================");
        circunferencia.area();
        System.out.println("===================================================");
        circunferencia.perimetro();
        

    }

}
