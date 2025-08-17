/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestListaAlumnos {
    
    public static void main(String args[]){
        AlumnoUnsta alumnoUno = new AlumnoUnsta("Juan","Perez","CA100");
        AlumnoUnsta alumnoDos = new AlumnoUnsta("Jose","Gomez","CA300");
        AlumnoUnsta alumnoTres = new AlumnoUnsta("Ana","Martin","CA090");
        AlumnoUnsta alumnoCuatro = new AlumnoUnsta("Luis","Villagra","CA095");
        AlumnoUnsta alumnoCinco = new AlumnoUnsta("Daniel","Alvarez","CA110");
        
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

        Collections.sort(alumnos, new AlumnoNameComparator());
        System.out.println("Ordenado por nombre");
        for(AlumnoUnsta alumno: alumnos){
            System.out.println(alumno);        
        }
//        
        Collections.sort(alumnos, new AlumnoLegajoComparator());
        System.out.println("Ordenado por legajo");
        for(AlumnoUnsta alumno: alumnos){
            System.out.println(alumno);
        }
    }    
}
