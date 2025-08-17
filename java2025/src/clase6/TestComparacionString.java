/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestComparacionString {
    
    public static void main(String args[]){
        String cadena1 = "a1";
        String cadena2 = new String("a1");
        String cadena3 = new String("Uno");
        String cadena4 = "Dos";
        System.out.println("Comparacion con equals");
        System.out.println(cadena1.equals(cadena2));
        System.out.println(cadena1.equals(cadena3));
        System.out.println(cadena2.equals(cadena4));
        
        System.out.println("Comparacion con ==");
        System.out.println(cadena1 == cadena2);
        System.out.println(cadena1 == cadena3);
        
        System.out.println("Comparacion con compareTo()");
        System.out.println(cadena1.compareTo(cadena2));
        System.out.println(cadena1.compareTo(cadena4));
        System.out.println(cadena4.compareTo(cadena2));      
    }
}
