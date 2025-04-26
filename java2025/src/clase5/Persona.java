/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

/**
 *
 * @author TRM
 */
public class Persona {
    private String nombre;
    private int edad;
    private static int contadorPersonas = 0;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.incrementarContador();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static int obtenerTotalPersonas() {
        return contadorPersonas;
    }

    private void incrementarContador() {
        contadorPersonas++;
    }    
}
