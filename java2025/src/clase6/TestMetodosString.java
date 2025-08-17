/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestMetodosString {
    
    public static void main(String args[]){
        Alumno alumno = new Alumno("Juan", "Perez");
        String nombreCompleto = alumno.getNombre()+alumno.getApellido();
        System.out.println("La longitud del String es:"+ nombreCompleto.length());
        
        System.out.println("Metodo charAt()");
        System.out.println(nombreCompleto.charAt(0));
        System.out.println(nombreCompleto.charAt(2));
        System.out.println(nombreCompleto.charAt(8));
        System.out.println(nombreCompleto.charAt(5)+"\n");
        
        System.out.println("Metodo trim()");
        String nomCompletoConEspacios = " "+alumno.getNombre()+" "+alumno.getApellido()+" ";
        System.out.println(nomCompletoConEspacios);
        System.out.println(nomCompletoConEspacios.length());
        String nomCompletoSinEspacios = nomCompletoConEspacios.trim();
        System.out.println(nomCompletoSinEspacios.length()+"\n");
        
        System.out.println("Metodo toLowerCase y toUpperCase()");
        System.out.println(nombreCompleto.toLowerCase());
        System.out.println(nombreCompleto.toUpperCase()+"\n");
        
        System.out.println("Metodo replace()");
        String nombreReplace = nombreCompleto.replace("Juan", "Jose");
        System.out.println(nombreReplace+"\n");
        
        System.out.println("Metodo contains()");
        String cadenaContenedora = "Los Alumnos de Programacion II, son buenos alumnos";
        System.out.println(cadenaContenedora.contains("Alumnos"));
        System.out.println(cadenaContenedora.contains("alumnos"));
        System.out.println(cadenaContenedora.contains("II"));
        if(cadenaContenedora.contains("de")){
            System.out.println("La subcadena ingresada fue encontrada\n");
        }else{
           System.out.println("La subcadena ingresada no fue encontrada\n"); 
        }
        
        System.out.println("Metodo indexOf()");
        int posicion = cadenaContenedora.indexOf("Los");
        if(posicion != -1){
            System.out.println("La cadena ingresada esta en la posicion:"+posicion +" de la cadena Contenedora");  
        }else{
            System.out.println("La cadena ingresada no esta en la cadena Contenedora");  
        }
    }
    
}
