package main;

import entidad.Rectangulo;

// @author Artyom

public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(4, 6);

        System.out.println("El Área del Rectángulo es de: [" + rectangulo1.calcularArea() + "]");
    }

}
