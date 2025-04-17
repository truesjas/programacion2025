/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class AlumnoEstatico {
    private String nombre;
    private String legajo;
    public static int asistencia = 0;

    public AlumnoEstatico(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        asistencia++;
    }

    public void imprimir() {
        System.out.println(nombre + " " + legajo);
    }
    
}
