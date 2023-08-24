package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.Libro;

public class Main {
    public static void main(String[] args) {
        crearLibros();
    }

    private static void crearLibros (){
        Libro libro1 = new Libro();
        libro1.setTitle("La Iliada");
        libro1.setGender("Epopeya, Poesía Épico");
        libro1.setAuthor("Homero");
        libro1.setPublicationYear("Siglo VIII A.C.");
        libro1.setEditorial("Feltrinelly. España");
        libro1.setPageNumber("187");

        Libro libro2 = new Libro();
        libro1.setTitle("El principito");
        libro1.setGender("Infantil, Fábula, Alegoría");
        libro1.setAuthor("Antoine de Saint-Exúpery");
        libro1.setPublicationYear("1943");
        libro1.setEditorial("Gran Travesia");
        libro1.setPageNumber("120");

        Libro libro3 = new Libro();
        libro1.setTitle("Yo, antes de tí");
        libro1.setGender("Novela, Drama");
        libro1.setAuthor("Jojo Moyes");
        libro1.setPublicationYear("2012");
        libro1.setEditorial("Penguin Books");
        libro1.setPageNumber("496");

        Libro libro4 = new Libro();
        libro1.setTitle("Don Quijote de la Mancha");
        libro1.setGender("Novela, Romance, Ficción");
        libro1.setAuthor("Miguel de Cervantes Saavedra");
        libro1.setPublicationYear("1605");
        libro1.setEditorial("urbano Manini");
        libro1.setPageNumber("462");

        Libro libro5 = new Libro();
        libro1.setTitle("La María");
        libro1.setGender("Novela, Ficción, Romance");
        libro1.setAuthor("Jorge Isaacs");
        libro1.setPublicationYear("1867");
        libro1.setEditorial("Samuel");
        libro1.setPageNumber("231");

        calcularVocalesYConsonantes(libro1, libro2, libro3, libro4, libro5);
    }

    public static void calcularVocalesYConsonantes(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5) {
        int cantidadNovela = 0;
        int cantidadConsonantes = 0;

        if (libro1.getGender().equals("Novela")) {
            cantidadNovela = cantidadNovela + 1;
        }
    }