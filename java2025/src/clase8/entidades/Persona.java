/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8.entidades;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class Persona {
    
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    } 

    @Override
    public String toString() {
        return "[ " + this.nombre + ", " + this.dni + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        Persona persona = (Persona)obj;
        return this.dni == persona.dni && this.nombre.equalsIgnoreCase(persona.nombre);
    }    
    
}
