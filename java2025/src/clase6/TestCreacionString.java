/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestCreacionString {
    
    public static void main(String args[]){
        char[] primeraCadena = {'p','r','o','g','r','a','m','a','c','i','o','n'};
        String cadena = new String(primeraCadena);
        System.out.println("La cadena es:"+ cadena);
        
        String cadena2 ="programacion";
        System.out.println("La segunda cadena es:"+ cadena2);
        
        
        String cadena3 = "programacion";
        System.out.println("La tercer cadena es:"+ cadena3);
       
        
        String cadena4 = new String("programacion");
        System.out.println("La cuarta cadena es:"+ cadena4);
        
    }    
}
