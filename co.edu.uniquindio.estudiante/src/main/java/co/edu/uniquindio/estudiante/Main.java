package co.edu.uniquindio.estudiante;

import java.util.Scanner;

//Importación clase Estudiante
import co.edu.uniquindio.estudiante.model.Estudiante;

//Creación clase Main
public class Main {
    public static void main(String[] args) {

        crearEstudiante();
    }

    //Método para Creación de Estudiantes e instancias
    private static void crearEstudiante(){

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(17);
        estudiante1.setCorreo("juan@mail.com");
        estudiante1.setSemestre(3);
        estudiante1.setNota1(3.0);
        estudiante1.setNota2(3.5);
        estudiante1.setNota3(4.5);

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Maria");
        estudiante2.setEdad(15);
        estudiante2.setCorreo("pepita@mail.com");
        estudiante2.setSemestre(1);
        estudiante2.setNota1(2.0);
        estudiante2.setNota2(2.5);
        estudiante2.setNota3(4.5);

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Pepe");
        estudiante3.setEdad(20);
        estudiante3.setCorreo("pepe@mail.com");
        estudiante3.setSemestre(4);
        estudiante3.setNota1(4.0);
        estudiante3.setNota2(2.5);
        estudiante3.setNota3(4.5);

        defEstudiante1(estudiante1);
        defEstudiante2(estudiante2);
        defEstudiante3(estudiante3);
        //calcularDefinitivaEstudiante(estudiante1, estudiante2, estudiante3);
        calcularPromedioCurso(estudiante1, estudiante2, estudiante3);
        calcularPromedioEdad(estudiante1, estudiante2, estudiante3);
        calcularPromedioNota1(estudiante1, estudiante2, estudiante3);
        calcularNotaMayorEst1(estudiante1);
        calcularNotaMayorEst2(estudiante2);
        calcularNotaMayorEst3(estudiante3);
        //calcularNotaMayorDelCurso(estudiante1, estudiante2, estudiante3);
        //calcularNotaMenorCurso(estudiante1, estudiante2, estudiante3);
        //aprobacionCurso(estudiante1, estudiante2, estudiante3);
        //calcularPorcentajeGanaronCurso(estudiante1, estudiante2, estudiante3);
        //calcularPorcentajePerdieronCurso(estudiante1, estudiante2, estudiante3);
        //obtenerEstudianteNotasMayor4(estudiante1, estudiante2, estudiante3);
        //notaMaxima(estudiante1, estudiante2, estudiante3);
    }

    //Método para cálcular el promedio de notas del estudiante 1
    private static double defEstudiante1(Estudiante estudiante1){

            double defEstudiante1 = 0;
            defEstudiante1 = (estudiante1.getNota1() + estudiante1.getNota2() + estudiante1.getNota3()) / 3;
            return defEstudiante1;
    }

    //Método para cálcular el promedio de notas del estudiante 2
    private static double defEstudiante2(Estudiante estudiante2){

        double defEstudiante2 = 0;
        defEstudiante2 = (estudiante2.getNota1() + estudiante2.getNota2() + estudiante2.getNota3()) / 3;
        return defEstudiante2;
    }

    //Método para cálcular el promedio de notas del estudiante 3
    private static double defEstudiante3(Estudiante estudiante3){

        double defEstudiante3 = 0;
        defEstudiante3 = (estudiante3.getNota1() + estudiante3.getNota2() + estudiante3.getNota3()) / 3;
        return defEstudiante3;
    }

    //Método para cálcular la nota definitiva de un estudiante
    //private static void calcularDefinitivaEstudiante(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){

    //Scanner scanner = new Scanner(System.in);
    //System.out.print("Digite el nombre del estudiante: ");

    //String nomEstudiante = String.valueOf(scanner.nextInt());

    //double definitiva = 0;

    //definitiva =


//////////////////////////////////////////////////////////////////////////////

        //double definitiva1 = 0;
        //double definitiva2 = 0;
        //double definitiva3 = 0;

        //definitiva1 = (estudiante1.getNota1() + estudiante1.getNota2() + estudiante1.getNota3()) / 3;
        //definitiva2 = (estudiante2.getNota1() + estudiante2.getNota2() + estudiante2.getNota3()) / 3;
        //definitiva3 = (estudiante3.getNota1() + estudiante3.getNota2() + estudiante3.getNota3()) / 3;

        //System.out.println("La Nota definitiva del estudiante " + estudiante1.getNombre() + " es : " + definitiva1);
        //System.out.println("La Nota definitiva del estudiante " + estudiante2.getNombre() + " es : " + definitiva2);
        //System.out.println("La Nota definitiva del estudiante " + estudiante3.getNombre() + " es : " + definitiva3);
    //}

    //Método para cálcular el promedio del curso
    private static void calcularPromedioCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){

        double promCurso = 0;

        promCurso = (defEstudiante1(estudiante1) + defEstudiante2(estudiante2) + defEstudiante3(estudiante3)) / 3;

        System.out.println("El promedio del curso es : " + promCurso);
    }

    //Método para cálcular el promedio de edad de los estudiantes
    private static void calcularPromedioEdad(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        double promEdad = 0;

        promEdad = (Double.valueOf(estudiante1.getEdad()) + Double.valueOf(estudiante2.getEdad()) + Double.valueOf(estudiante3.getEdad())) / 3;

        System.out.println("El Promedio de edad de los estudiantes es de : " + promEdad);
    }

    //Método para cálcular el promedio de la nota 1 de los estudiantes
    private static void calcularPromedioNota1(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        double promNota1 = 0;

        promNota1 = (estudiante1.getNota1() + estudiante2.getNota1() + estudiante3.getNota1()) / 3;

        System.out.println("El Promedio de la nota 1 de los estudiantes en el curso es: " + promNota1);
    }

    //Método para calcular la nota mayor del estudiante 1
    private static double calcularNotaMayorEst1(Estudiante estudiante1) {

        double notaMayorEst1 = 0;

        if (estudiante1.getNota1() > estudiante1.getNota2()) {
            if (estudiante1.getNota1() > estudiante1.getNota3()) {
                notaMayorEst1 = estudiante1.getNota1();
                System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst1);
            } else {
                notaMayorEst1 = estudiante1.getNota3();
                System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst1);
            }
        } else if (estudiante1.getNota2() > estudiante1.getNota3()) {
            notaMayorEst1 = estudiante1.getNota2();
            System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst1);
        } else {
            notaMayorEst1 = estudiante1.getNota3();
            System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst1);
        }
        return notaMayorEst1;
    }

    //Método para calcular la nota mayor del estudiante 2
    private static double calcularNotaMayorEst2(Estudiante estudiante2) {

        double notaMayorEst2 = 0;

        if (estudiante2.getNota1() > estudiante2.getNota2()) {
            if (estudiante2.getNota1() > estudiante2.getNota3()) {
                notaMayorEst2 = estudiante2.getNota1();
                System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst2);
            } else {
                notaMayorEst2 = estudiante2.getNota3();
                System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst2);
            }
        } else if (estudiante2.getNota2() > estudiante2.getNota3()) {
            notaMayorEst2 = estudiante2.getNota2();
            System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst2);
        } else {
            notaMayorEst2 = estudiante2.getNota3();
            System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst2);
        }
        return notaMayorEst2;
    }

    //Método para calcular la nota mayor del estudiante 3
    private static double calcularNotaMayorEst3(Estudiante estudiante3) {

        double notaMayorEst3 = 0;

        if (estudiante3.getNota1() > estudiante3.getNota2()) {
            if (estudiante3.getNota1() > estudiante3.getNota3()) {
                notaMayorEst3 = estudiante3.getNota1();
                System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst3);
            } else {
                notaMayorEst3 = estudiante3.getNota3();
                System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst3);
            }
        } else if (estudiante3.getNota2() > estudiante3.getNota3()) {
            notaMayorEst3 = estudiante3.getNota2();
            System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst3);
        } else {
            notaMayorEst3= estudiante3.getNota3();
            System.out.println(" La nota mayor del estudiante 1 es : " + notaMayorEst3);
        }
        return notaMayorEst3;
    }




}