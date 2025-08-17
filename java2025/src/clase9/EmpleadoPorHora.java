/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class EmpleadoPorHora extends Persona{
    
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, int edad, double salarioPorHora, int horasTrabajadas) {
        super(nombre, edad);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }    
}
