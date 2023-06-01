
package entidad;

import java.util.*;


public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        System.out.print("Ingrese el Radio de la Circunferencia: ");
        setRadio(leer.nextDouble());
        
        System.out.println("");
        
    }
    
    public void area() {
    
        double area = Math.PI * Math.pow(getRadio(), 2);
        
        System.out.println("Área de la Circunferencia: [" + area + "]");
    
    }
    
    public void perimetro() {
    
        double perimetro = 2 * Math.PI * getRadio();
        
        System.out.println("Perímetro de la Circunferencia: [" + perimetro + "]");
    }
}

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
 * A continuación, se deben crear los siguientes métodos:
 * Método constructor que inicialice el radio pasado como parámetro.
 * Métodos get y set para el atributo radio de la clase Circunferencia.
 * Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
 * Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
 * Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
