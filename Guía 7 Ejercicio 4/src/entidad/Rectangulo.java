
package entidad;

import java.util.*;

public class Rectangulo {
   
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo() {

        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.print("Ingrese la Base del Rectángulo: ");
        setBase(leer.nextInt());
        
        System.out.print("Ingrese la Altura del Rectángulo: ");
        setAltura(leer.nextInt());
    }

    public float calcularSuperficie() {
    
        float superficie = getBase() * getAltura();
        
        return superficie;
    }
    
    public float calcularPerimetro() {
    
        float perimetro = (getBase() * getAltura()) * 2;
        
        return perimetro;
    
    }
    
    public void dibujarRectangulo() {

        for (int i = 1; i <= getBase(); i++) {

            for (int j = 1; j <= getAltura(); j++) {

                if (i == 1 || i == getBase() || j == 1 || j == getAltura()) {

                    System.out.print("* ");

                } else {
                    
                    System.out.print("  ");
                }

            }

            System.out.println("");
        }
    }
}

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
 * La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
 * También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
 * Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
 * Se deberán además definir los métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */