/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestInmutable {
    
    public static void main(String args[]){
        String cadena = "Programacion";        
        cadena = cadena+"Dos";
        System.out.println(cadena.concat(" Dos"));
        //cadena = cadena.concat(" Dos");
        
        System.out.println(cadena);
        
    }
    
}
