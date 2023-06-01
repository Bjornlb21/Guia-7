
package main;

import entidad.Empleado;
import java.util.Scanner;

// @author Artyom

public class Main {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        Empleado empleado = new Empleado();
        
        System.out.print("Ingrese el Nombre del Empleado: ");
        empleado.setNombre(leer.next());
        
        System.out.print("Ingrese la Edad del Empleado: ");
        empleado.setEdad(leer.nextInt());
        
        System.out.print("Ingrese el Salario del Empleado: ");
        empleado.setSalario(leer.nextDouble());
        
        System.out.println("");
        empleado.calcularAumento();
        System.out.println("");
        System.out.println(empleado);

    }

}
