
package entidad;

import java.util.*;


public class Puntos {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Ingrese las coordenadas del primer punto:");
        System.out.print("x1: ");
        setX1(leer.nextInt());
        System.out.print("y1: ");
        setY1(leer.nextInt());
        
        System.out.println("");
        
        System.out.println("Ingrese las coordenadas del segundo punto:");
        System.out.print("x2: ");
        setX2(leer.nextInt());
        System.out.print("y2: ");
        setY2(leer.nextInt());
        
    }
    
    public double distanciaPuntos() {
        
        double distanciaX = getX2() - getX1();
        double distanciaY = getY2() - getY1();
        
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

}

/*
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
 *      sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
 * Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números 
 *      y los ingresa en los atributos del objeto. 
 * Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
 */