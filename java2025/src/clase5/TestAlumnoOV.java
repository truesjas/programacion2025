/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase5;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestAlumnoOV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlumnoOverLoading alumno1 = new AlumnoOverLoading("Juan", "Pérez", 12345);

        // Mostrando nombre y apellido
        alumno1.mostrarDatos();

        // Mostrando legajo y promedio
        alumno1.mostrarDatos(8.5);

        // Mostrando legajo y dirección
        alumno1.mostrarDatos("Calle San Martin 123");    
    }
    
}
