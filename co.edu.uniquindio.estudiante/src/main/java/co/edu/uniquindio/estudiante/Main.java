package co.edu.uniquindio.estudiante;

//Importación clase Estudiante
import co.edu.uniquindio.estudiante.model.Estudiante;

//Creación clase Main
public class Main {
    public static void main(String[] args) {

        crearEstudiante();
        //calcularPromedioCurso();
        //calcularPromedioEdad();
        //calcularPromedioNota1();
        //calcularNotaMayorDelCurso();
        //calcularNotaMenorCurso();
        //aprobacionCurso();
        //calcularPorcentajeGanaronCurso();
        //calcularPorcentajePerdieronCurso();
        //obtenerEstudianteNotasMayor4();
        //notaMaxima();
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

        calcularDefinitivaEstudiante(estudiante1, estudiante2, estudiante3);

    }

    //Método para calcular la nota definitiva de un estudiante
    private static void calcularDefinitivaEstudiante(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){

        double definitiva1 = 0;
        double definitiva2 = 0;
        double definitiva3 = 0;

        definitiva1 = (estudiante1.getNota1() + estudiante1.getNota2() + estudiante1.getNota3()) / 3;
        definitiva2 = (estudiante2.getNota1() + estudiante2.getNota2() + estudiante2.getNota3()) / 3;
        definitiva3 = (estudiante3.getNota1() + estudiante3.getNota2() + estudiante3.getNota3()) / 3;

        System.out.println("La Nota definitiva del estudiante " + estudiante1.getNombre() + " es : " + definitiva1);
        System.out.println("La Nota definitiva del estudiante " + estudiante2.getNombre() + " es : " + definitiva2);
        System.out.println("La Nota definitiva del estudiante " + estudiante3.getNombre() + " es : " + definitiva3);
    }

}