/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase5;

/**
 *
 * @author TRM
 */
public class TestPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 30);
        Persona persona2 = new Persona("Carlos", 25);
        Persona persona3 = new Persona("Sofía", 40);
        
        System.out.println("Primera persona creada: " + persona1);
        System.out.println("Segunda persona creada: " + persona2);
        System.out.println("Tercera persona creada: " + persona3);
        System.out.println("Total de personas creadas: " + Persona.obtenerTotalPersonas());
    }
    
}
