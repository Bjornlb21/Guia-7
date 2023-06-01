
package entidad;

import java.util.*;

public class Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public void cargarLibro() {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        System.out.print("Ingrese el ISBN del Libro: ");
        setIsbn(leer.nextInt());
        
        System.out.print("Ingrese el Título del Libro: ");
        setTitulo(leer.next());
        
        System.out.print("Ingrese el Autor del Libro: ");
        setAutor(leer.next());
        
        System.out.print("Ingrese el Número de Páginas: ");
        setNumPaginas(leer.nextInt());
    }
    
    public void mostrarLibro() {
    
        System.out.println("ISBN: [" + getIsbn() + "]");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Número de Páginas: " + getNumPaginas());
        
    }
}

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: 
 *      ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. * Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, 
 *      el título, el autor del libro y el número de páginas.
 */