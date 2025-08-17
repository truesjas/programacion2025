/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class EmpleadoAsalariado extends Persona{
    
    private double salarioBase;

    public EmpleadoAsalariado(String nombre, int edad, double salarioBase) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }    
}
