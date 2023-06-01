
package main;

import entidad.Cuenta;
import java.util.Scanner;

// @author Artyom

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        Cuenta cuenta = new Cuenta();

        System.out.print("Ingrese el nombre del Titular: ");
        cuenta.setTitular(leer.next());

        System.out.print("Ingrese el Saldo del Titular: ");
        cuenta.setSaldo(leer.nextInt());
        
        System.out.println("");
        System.out.print("Ingrese cuánto dinero desea retirar: ");
        int retiro = leer.nextInt();
        
        cuenta.retirarDinero(retiro);
        
    }

}
