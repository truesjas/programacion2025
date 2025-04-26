/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class AlumnoOverLoading {
    
    private String nombre;
    private String apellido;
    private int legajo;
    private double promedio;
    private String direccion;
    private String email;

    public AlumnoOverLoading(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;        
    }

    // Método sobrecargado para mostrar nombre y apellido
    public void mostrarDatos() {
        System.out.println("Nombre y Apellido: " + nombre + " " + apellido);
    }

    // Método sobrecargado para mostrar legajo y promedio
    public void mostrarDatos(double promedio) {
        this.promedio = promedio;
        System.out.println("Legajo: " + legajo + ", Promedio: " + promedio);
    }

    // Método sobrecargado para mostrar legajo y dirección
    public void mostrarDatos(String direccion) {
        this.direccion = direccion;
        System.out.println("Legajo: " + legajo + ", Dirección: " + direccion);
    }
    
    public void mostrarDatos(String direccion, String email){
        this.direccion = direccion;
        this.email = email;
        System.out.println("Legajo:"+ legajo+" " + direccion+ " " + email);
    }
}
