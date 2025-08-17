/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase7;

import java.util.Arrays;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado[] empleados = {
            new Empleado("Juan",25,150000),
            new Empleado("Ana",30,200000),
            new Empleado("Pedro",20,300000),
            new Empleado("Luis",26, 250000)
        };
        
        
        Arrays.sort(empleados);
        
        for (Empleado e : empleados) {
            System.out.println(e.getNombre()+ " - " + e.getEdad()+ " - "+e.getSalario());
        } 
    }    
}
