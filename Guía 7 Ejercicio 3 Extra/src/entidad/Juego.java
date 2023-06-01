
package entidad;

import java.util.*;
public class Juego {
    
    private int numSecreto;
    private int ganadas;
    private int intentosMax;

    public Juego() {
    }

    public Juego(int numSecreto, int ganadas, int intentosMax) {
        this.numSecreto = numSecreto;
        this.ganadas = ganadas;
        this.intentosMax = intentosMax;
    }

    public int getNumSecreto() {
        return numSecreto;
    }

    public void setNumSecreto(int numSecreto) {
        this.numSecreto = numSecreto;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }
    
    public void ingresarDatos() {

        Scanner leer = new Scanner(System.in, "ISO-8859-1");

        System.out.print("Ingrese la cantidad de intentos máximos: ");
        setIntentosMax(leer.nextInt());

        System.out.println("");

        System.out.print("Jugador 1 | Elija un Número: ");
        setNumSecreto(leer.nextInt());

    }
    
    public void iniciarJuego() {
        
        ingresarDatos();
        
        int intentos = getIntentosMax();
        
        System.out.println("");
     
        do {
            
            Scanner leer = new Scanner(System.in, "ISO-8859-1");
            
            System.out.print("Jugador 2 | Intente adivinar el Número: ");
            int numAdivinado = leer.nextInt();

            System.out.println("");

            if (numAdivinado == getNumSecreto()) {

                System.out.println("!Adivinaste el Número!");
                System.out.println("");
                setGanadas(+ 1);
                
                break;

            } else if (numAdivinado < getNumSecreto()) {

                System.out.println("Más Alto");
                System.out.println("");

            } else if (numAdivinado > getNumSecreto()) {
                
                System.out.println("Más Bajo");
                System.out.println("");
            }
            
            intentos --;
            
            System.out.println("Intentos restantes: [" + intentos + "]");
            System.out.println("");

        } while (intentos > 0);
        
        System.out.println("Partidas Ganadas: [" + getGanadas() + "].");

    }
}

/*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
 * El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
 * El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
 * Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */