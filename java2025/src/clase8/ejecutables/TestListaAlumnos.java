/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8.ejecutables;


import clase8.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestListaAlumnos {
    
    public static void main(String args[]){
        AlumnoUnsta alumnoUno = new AlumnoUnsta("Juan","Perez","CA100", 20, "30000500");
        AlumnoUnsta alumnoDos = new AlumnoUnsta("Jose","Gomez","CA300", 22, "30000100");
        AlumnoUnsta alumnoTres = new AlumnoUnsta("Ana","Martin","CA090", 25, "30000400");
        AlumnoUnsta alumnoCuatro = new AlumnoUnsta("Luis","Villagra","CA095", 21, "30000300");
        AlumnoUnsta alumnoCinco = new AlumnoUnsta("Daniel","Alvarez","CA110",23, "30000200");
        
        List<AlumnoUnsta> alumnos = new ArrayList<AlumnoUnsta>();
        
        alumnos.add(alumnoUno);
        alumnos.add(alumnoDos);
        alumnos.add(alumnoTres);
        alumnos.add(alumnoCuatro);
        alumnos.add(alumnoCinco);
        
//        Collections.sort(alumnos);
//        for(AlumnoUnsta alumno: alumnos){
//            System.out.println(alumno);        
//        }

//        Collections.sort(alumnos, new AlumnoNameComparator());
//        System.out.println("Ordenado por nombre");
//        for(AlumnoUnsta alumno: alumnos){
//            System.out.println(alumno);        
//        }
//        
//        Collections.sort(alumnos, new LegajoComparator());
//        System.out.println("Ordenado por legajo");
//        for(AlumnoUnsta alumno: alumnos){
//            System.out.println(alumno);
//        }

        Collections.sort(alumnos, new EdadComparator());
        System.out.println("Ordenado por edad");
//        for(AlumnoUnsta alumno: alumnos){
//            System.out.println(alumno);
//        }
        System.out.println(alumnos);
    }    
}
