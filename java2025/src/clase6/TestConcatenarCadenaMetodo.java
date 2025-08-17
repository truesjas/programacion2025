/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

import java.util.StringJoiner;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestConcatenarCadenaMetodo {
    
    public static void main(String args[]){
        Alumno alumno = new Alumno("Juan", " Perez");
        String nombreCompleto = alumno.getNombre().concat(alumno.getApellido());
        System.out.println(nombreCompleto);
        
        //Con StringBuilder
        System.out.println("** Con StringBuilder **");
        StringBuilder strBuilder = new StringBuilder(alumno.getNombre());
        StringBuilder strBuilder1 = new StringBuilder(alumno.getApellido());
        StringBuilder nombreBuilder = strBuilder.append(strBuilder1);
        System.out.println(nombreBuilder.toString());
        
        System.out.println("** Con format() **");
        Alumno alumnoFormat = new Alumno("Ana", "Fernandez");
        String nombreCompletoFormat = String.format("%s%s", alumnoFormat.getNombre(), alumnoFormat.getApellido());
        System.out.println(nombreCompletoFormat);
        
        System.out.println("** Con StringJoin **");
        Alumno alumnoJoin = new Alumno("Jose", "Juarez");
        String nombreCompletoJoin = String.join(" ", alumnoJoin.getNombre(), alumnoJoin.getApellido());
        System.out.println(nombreCompletoJoin);
        
        System.out.println("** Con StringJoiner **");
        Alumno alumnoJoiner = new Alumno("Alejandro", "Flores");
        StringJoiner nombreCompletoJoiner = new StringJoiner("-");
        nombreCompletoJoiner.add(alumnoJoiner.getNombre());
        nombreCompletoJoiner.add(alumnoJoiner.getApellido());
        System.out.println(nombreCompletoJoiner.toString());
    }
    
}
