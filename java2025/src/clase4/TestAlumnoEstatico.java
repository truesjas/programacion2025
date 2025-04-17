/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestAlumnoEstatico {
    public static void main(String[] args) {
        System.out.println("Valor del atributo estático cantidad:" + AlumnoEstatico.asistencia);
        AlumnoEstatico per1 = new AlumnoEstatico("Juan", "CIA20");
        per1.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + AlumnoEstatico.asistencia);
        AlumnoEstatico per2 = new AlumnoEstatico("Ana", "CIA30");
        per2.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + AlumnoEstatico.asistencia);
        AlumnoEstatico per3 = new AlumnoEstatico("Luis", "CIA30");
        per3.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + AlumnoEstatico.asistencia);
    }    
}
