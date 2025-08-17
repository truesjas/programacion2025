/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class AlumnoUnsta implements Comparable<AlumnoUnsta>{
    private String nombre;    
    private String apellido;    
    private String legajo;
    private int edad;
    private String dni;

    public AlumnoUnsta(String nombre, String apellido, String legajo, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getDni(){
        return dni;
    }
    
    @Override
    public int compareTo(AlumnoUnsta o) {
       return apellido.compareTo(o.getApellido()) ; 
    }

    @Override
    public String toString() {
        return "AlumnoUnsta{" + "nombre=" + nombre + ", apellido=" 
                + " "+apellido + ", legajo=" + legajo + ", edad:"+ edad + ", dni:"+ dni+ '}'+"\n";
    }   
}
