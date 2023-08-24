package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Libro;

public class Main {
    public static void main(String[] args) {

        crearLibros();
    }

    private static void crearLibros() {
        Libro libro1 = new Libro();
        libro1.setTitle("El Cuervo");
        libro1.setGender("Poema Narrativo");
        libro1.setAuthor("Edgar Allan Poe");
        libro1.setPublicationYear("1845");
        libro1.setEditorial("New-York Mirror");
        libro1.setPageNumber("72");

        Libro libro2 = new Libro();
        libro2.setTitle("El Código Da Vinci");
        libro2.setGender("Novela Policíaca/ Ficción");
        libro2.setAuthor("Dan Brown");
        libro2.setPublicationYear("2003");
        libro2.setEditorial("Doubleday");
        libro2.setPageNumber("656");

        Libro libro3 = new Libro();
        libro3.setTitle("El Viejo y el Mar");
        libro3.setGender("Novela");
        libro3.setAuthor("Ernest Hemingway");
        libro3.setPublicationYear("1951");
        libro3.setEditorial("Charles Scribner's Sons");
        libro3.setPageNumber("127");

        Libro libro4 = new Libro();
        libro4.setTitle("El Arte de la Guerra");
        libro4.setGender("Tratado de Táctica Militar");
        libro4.setAuthor("Sun Tzu");
        libro4.setPublicationYear("400 a.c.");
        libro4.setEditorial("N/A");
        libro4.setPageNumber("152");

        Libro libro5 = new Libro();
        libro5.setTitle("Moby Dick");
        libro5.setGender("Novela");
        libro5.setAuthor("Herman Melville");
        libro5.setPublicationYear("1851");
        libro5.setEditorial("Richard Bentley");
        libro5.setPageNumber("823");

    }

    public static void esVocal (Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5) {

        int contadorVocal = 0;
        int contadorConsonante = 0;

        if (esVocal(libro1.getTitle().charAt(0))) {
            contadorVocal += 1;
        } else {
            contadorConsonante += 1;
        }

        if (esVocal(libro2.getTitle().charAt(0))) {
            contadorVocal += 1;
        } else {
            contadorConsonante += 1;
        }

        if (esVocal(libro3.getTitle().charAt(0))) {
            contadorVocal += 1;
        } else {
            contadorConsonante += 1;
        }

        if (esVocal(libro4.getTitle().charAt(0))) {
            contadorVocal += 1;
        } else {
            contadorConsonante += 1;
        }

        if (esVocal(libro5.getTitle().charAt(0))) {
            contadorVocal += 1;
        } else {
            contadorConsonante += 1;
        }

        System.out.println("La cantidad de vocales es: + contadorVocal");
        System.out.println("La cantidad de consonantes son : + contadorConsonante");

    }

    public static void cambiarTitulo (Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5) {

        String tituloActual = "Cálculo Integral";
        String tituloNuevo = "Cálculo Integral y Diferencial";

        if (libro1.getTitle().equalsIgnoreCase(tituloActual)) {
            libro1.setTitle(tituloNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: " + libro1.getTitle());
        }

        if (libro2.getTitle().equalsIgnoreCase(tituloActual)) {
            libro2.setTitle(tituloNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: " + libro2.getTitle());
        }

        if (libro3.getTitle().equalsIgnoreCase(tituloActual)) {
            libro3.setTitle(tituloNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: " + libro3.getTitle());
        }

        if (libro4.getTitle().equalsIgnoreCase(tituloActual)) {
            libro4.setTitle(tituloNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: " + libro4.getTitle());
        }

        if (libro5.getTitle().equalsIgnoreCase(tituloActual)) {
            libro5.setTitle(tituloNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: " + libro5.getTitle());
        }
    }

    private static boolean esVocal(char caracter) {

        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static void librosActuales (Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5) {

        int cantidadLibros = 0;

        if(libro1.getPublicationYear()>=2000) {
            cantidadLibros +=1;
        }

        if(libro2.getPublicationYear()>=2000) {
            cantidadLibros +=1;
        }

        if(libro3.getPublicationYear()>=2000) {
            cantidadLibros +=1;
        }

        if(libro4.getPublicationYear()>=2000) {
            cantidadLibros +=1;
        }

        if(libro5.getPublicationYear()>=2000) {
            cantidadLibros +=1;
        }

        System.out.println("La cantidad de libros publicados desde el año 2000 es: + cantidadLibros");


    }

    private static String buscarTerror (Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5) {

        int contadorTerror = 0;

        if (libro1.getGender().equalsIgnoreCase("Terror")) {
            contadorTerror +=1;
        }
        if (libro2.getGender().equalsIgnoreCase("Terror")) {
            contadorTerror +=1;
        }
        if (libro3.getGender().equalsIgnoreCase("Terror")) {
            contadorTerror +=1;
        }
        if (libro4.getGender().equalsIgnoreCase("Terror")) {
            contadorTerror +=1;
        }
        if (libro5.getGender().equalsIgnoreCase("Terror")) {
            contadorTerror +=1;
        }
        System.out.println("La cantidad de libros del género Terror es: + contadorTerror");

    }






}
