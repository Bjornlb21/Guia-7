
package entidad;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularAumento() {
    
        if (getEdad() > 30) {
            
            double aumento = getSalario() * 0.10;
            
            setSalario(getSalario() + aumento);
            
            System.out.println("El aumento del Empleado " + getNombre() + " es de [$" + aumento + "]" );
            
        } else {
        
            double aumento = getSalario() * 0.05;
            
            setSalario(getSalario() + aumento);
            
            System.out.println("El aumento del Empleado " + getNombre() + " es de [$" + aumento + "]" );
        }
        
    }

    @Override
    public String toString() {
        return "Empleado {" + "Nombre}: " + nombre + " | Edad: [" + edad + "] | Salario con Aumento: [$" + salario + "]";
    }
}

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */